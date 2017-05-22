package test;

import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import hardware.button.Button;
import hardware.led.DualColorLed;
import java.io.IOException;

public class ButtonDualLedTest {
	public static void main(String[] args) throws IOException {
		DualColorLed dualColorLed = new DualColorLed(RaspiPin.GPIO_24, RaspiPin.GPIO_25);
		
		Button button = new Button(RaspiPin.GPIO_00);
		
		button.setGpioPinListenerDigital(e->{
			if(e.getState() == PinState.LOW){
				dualColorLed.red();
			}else{
				dualColorLed.green();
			}
		});
		System.out.println("Ready.......");
		System.in.read();
	}
}
