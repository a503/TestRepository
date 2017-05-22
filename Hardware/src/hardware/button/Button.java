package hardware.button;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import java.io.IOException;


public class Button {
	private GpioPinDigitalInput gpioPinDigitalInput;
	
	public Button(Pin buttonPinNo){
		GpioController gpioController = GpioFactory.getInstance();
		
		gpioPinDigitalInput = gpioController.provisionDigitalInputPin(buttonPinNo);
		
		gpioPinDigitalInput.setShutdownOptions(true); // true 입력모드를 해제 false 입력모드를 유지
	}
	public void setGpioPinListenerDigital(GpioPinListenerDigital listener){
		gpioPinDigitalInput.addListener(listener); // 기본적으로 JavaFX의 버튼 사용 형식과 비슷하다.
	}
	public static void main(String[] args) throws IOException {
		Button button = new Button(RaspiPin.GPIO_00);
		
		button.setGpioPinListenerDigital(new GpioPinListenerDigital() { //GpioPinListenerDigital -> 익명객체
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
				if(event.getState() == PinState.HIGH){
					System.out.println("High"); // 때을때
				}else{
					System.out.println("Low"); // 눌렀을때 
				}
			}
		});
		
		System.out.println("Ready....");
		System.in.read();
	}
}
