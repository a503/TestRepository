package test;

import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import hardware.button.Button;
import hardware.led.RgbLed;
import java.io.IOException;

public class ButtonRgbLedTest {

	public static void main(String[] args) throws IOException {
		RgbLed rgbLed = new RgbLed(RaspiPin.GPIO_27, RaspiPin.GPIO_28, RaspiPin.GPIO_29);
		Button red = new Button(RaspiPin.GPIO_00);
		Button green = new Button(RaspiPin.GPIO_01);
		Button blue = new Button(RaspiPin.GPIO_02);

		red.setGpioPinListenerDigital(e -> {
			if (e.getState() == PinState.HIGH) {
				rgbLed.red(false); // 때을때
			} else {
				rgbLed.red(true); // 눌렀을때 
			}
		});
		blue.setGpioPinListenerDigital(e -> {
			if (e.getState() == PinState.HIGH) {
				rgbLed.blue(false); // 때을때
			} else {
				rgbLed.blue(true); // 눌렀을때 
			}
		});
		green.setGpioPinListenerDigital(e -> {
			if (e.getState() == PinState.HIGH) {
				rgbLed.green(false); // 때을때
			} else {
				rgbLed.green(true); // 눌렀을때 
			}
		});
		
		System.out.println("Ready....");
		System.in.read();
	}
}
