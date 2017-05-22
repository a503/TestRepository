package test;

import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import hardware.button.Button;
import hardware.buzzer.ActiveBuzzer;
import java.io.IOException;

public class ButtonActiveBuzzerTest {

	public static void main(String[] args) throws IOException {
		Button button = new Button(RaspiPin.GPIO_01);
		ActiveBuzzer test = new ActiveBuzzer(RaspiPin.GPIO_00);

		button.setGpioPinListenerDigital(e -> {
			if (e.getState() == PinState.HIGH) {
				test.off(); // 때을때
			} else {
				test.on(); // 눌렀을때 
			}
		});
		System.out.println("ready");
		System.in.read();
	}
}
