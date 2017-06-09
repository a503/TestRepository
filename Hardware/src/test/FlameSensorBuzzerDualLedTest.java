package test;

import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import hardware.buzzer.ActiveBuzzer;
import hardware.converter.PCF8591;
import hardware.led.DualColorLed;
import hardware.sensor.FlameSensor;
import java.io.IOException;

public class FlameSensorBuzzerDualLedTest {
	public static void main(String[] args) throws IOException {
		PCF8591 pcf8591 = new PCF8591(0x48, PCF8591.AIN0);
		FlameSensor flameSensor = new FlameSensor(pcf8591, RaspiPin.GPIO_00);
		DualColorLed dualColorLed = new DualColorLed(RaspiPin.GPIO_02, RaspiPin.GPIO_03);
		ActiveBuzzer activeBuzzer = new ActiveBuzzer(RaspiPin.GPIO_25);
		
		flameSensor.setGpioPinListenerDigital(e->{
			if(e.getState() == PinState.LOW){
				dualColorLed.red();
				activeBuzzer.on();
			}else{
				dualColorLed.green();
				activeBuzzer.off();
			}
		});
		
		System.out.println("ready");
		System.in.read();
	}
}
