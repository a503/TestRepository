package hardware.sensor;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import hardware.converter.PCF8591;

public class GasSensor {
	private PCF8591 pcf8591;
	private GpioPinDigitalInput gpioPinDigitalInput;
	
	public GasSensor(PCF8591 pcf8591, Pin digitalPinNo){
		this.pcf8591 = pcf8591;
		
		// DO(Digital Output Pin)의 정보 주기
		GpioController gpioController = GpioFactory.getInstance();
		gpioPinDigitalInput = gpioController.provisionDigitalInputPin(digitalPinNo);
		gpioPinDigitalInput.setShutdownOptions(true, PinState.LOW);
	}
	
	public void setGpioPinListenerDigital(GpioPinListenerDigital listener){
		gpioPinDigitalInput.addListener(listener);
	}
	
	public double getValue() throws Exception{
		int analogVal = pcf8591.analogRead(); // 0~255
		return analogVal;
	}
	public static void main(String[] args) throws Exception {
		PCF8591 pcf8591 = new PCF8591(0x48, PCF8591.AIN0);
		GasSensor test = new GasSensor(pcf8591, RaspiPin.GPIO_00);
		
		// 방법 1 : digital Pin의 상태를 이용
		// 익명 객체
		test.setGpioPinListenerDigital(new GpioPinListenerDigital() {
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
				//System.out.println("#################" + event.getState() + "#################" );
				if(event.getState() == PinState.LOW){
					System.out.println("********* 검출 **********");
				}else{
					System.out.println("********* 정상 **********");
				}
			}
		});
		// 람다식
//		test.setGpioPinListenerDigital(e->{
//			
//		});

		// 방법 2 : Analog 값을 이용해서 처리
		while(true){
			double value = test.getValue();
			//System.out.println("value : " + value);
			if(value > 200){
				// 방법 1 : Analog 값을 이용해서 처리
				System.out.println(value);
			}else{
				System.out.println(value);
			}
			Thread.sleep(1000);
		}
	}
}
