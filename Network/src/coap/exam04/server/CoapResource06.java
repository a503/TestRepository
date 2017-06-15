/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coap.exam04.server;

import com.pi4j.io.gpio.RaspiPin;
import hardware.buzzer.ActiveBuzzer;
import hardware.converter.PCF8591;
import hardware.led.RgbLedPWM;
import hardware.motor.DCmotor;
import hardware.motor.PCA9685;
import hardware.sensor.GasSensor;
import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.server.resources.CoapExchange;

/**
 *
 * @author kang
 */
public class CoapResource06 extends CoapResource{
	private double value;
	private PCF8591 pcf8591;
	private GasSensor gasSensor;
	private RgbLedPWM rgbLedPWM;
	private DCmotor dcMotorA;
	private DCmotor dcMotorB;
	private ActiveBuzzer activeBuzzer;

	public CoapResource06() throws Exception {
		super("resource06");
		// 관찰 기능 활성화
		setObservable(true);
		// 관찰 기능을 제공하다라는 것을 클라이언트가 알 수 있또록 설정
		getAttributes().setObservable();
		
		pcf8591 = new PCF8591(0x48, PCF8591.AIN2);
		
		gasSensor = new GasSensor(pcf8591, RaspiPin.GPIO_23);
		
		rgbLedPWM = new RgbLedPWM(RaspiPin.GPIO_04, RaspiPin.GPIO_05, RaspiPin.GPIO_06);
		
		PCA9685 pca9685 = PCA9685.getInstance();
		
		dcMotorA = new DCmotor(RaspiPin.GPIO_00, RaspiPin.GPIO_01, pca9685, PCA9685.PWM_05);
		dcMotorB = new DCmotor(RaspiPin.GPIO_02, RaspiPin.GPIO_03, pca9685, PCA9685.PWM_04);
		
		activeBuzzer = new ActiveBuzzer(RaspiPin.GPIO_24);
		
		Thread thread = new Thread(){
			@Override
			public void run() {
				try {
					value = gasSensor.getValue();
				} catch (Exception ex) {

				}
				if(value > 230){
					changed();
					rgbLedPWM.ledColorSet(255, 0, 0);

					dcMotorA.forward();
					dcMotorA.setSpeed(2000);
					dcMotorB.forward();
					dcMotorB.setSpeed(2000);
					activeBuzzer.on();
				}else{
					rgbLedPWM.ledColorSet(0, 255, 0);
					dcMotorA.stop();
					dcMotorB.stop();
					activeBuzzer.off();
				}

				try{Thread.sleep(500);}catch(Exception e){}
			}
		};
		thread.start();
	}

	@Override
	public void handleGET(CoapExchange exchange) {
		exchange.respond("value=" + value);
	}

	@Override
	public void handlePOST(CoapExchange exchange) {
		// 외부에 있는 장치에서 온 데이터를 검사하는 기능 수행
	}
	
	
}
