/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.pi4j.io.gpio.RaspiPin;
import hardware.buzzer.ActiveBuzzer;
import hardware.converter.PCF8591;
import hardware.led.DualColorLed;
import hardware.motor.SG90Servo;
import hardware.sensor.GasSensor;

/**
 *
 * @author kang
 */
public class GasSensorBuzzerDualLedServoMotorTest {
	public static void main(String[] args) throws Exception {
		SG90Servo servo = new SG90Servo(RaspiPin.GPIO_01);
		PCF8591 pcf8591 = new PCF8591(0x48, PCF8591.AIN0);
		GasSensor gas = new GasSensor(pcf8591, RaspiPin.GPIO_00);
		DualColorLed dualLed = new DualColorLed(RaspiPin.GPIO_24, RaspiPin.GPIO_25);
		
		ActiveBuzzer test = new ActiveBuzzer(RaspiPin.GPIO_02);
		
		while(true){
			double value = gas.getValue();
			//System.out.println("value : " + value);
			if(value > 240){
				// 방법 1 : Analog 값을 이용해서 처리
				servo.setAngle(180);
				dualLed.red();
				test.on();
			}else{
				servo.setAngle(0);
				dualLed.green();
				test.off();
			}
			System.out.println(value);
			Thread.sleep(1000);
		}
	}
}
