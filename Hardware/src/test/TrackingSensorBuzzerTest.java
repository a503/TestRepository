/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import hardware.buzzer.ActiveBuzzer;
import hardware.sensor.TrackingSensor;
import java.io.IOException;

/**
 *
 * @author kang
 */
public class TrackingSensorBuzzerTest {
	public static void main(String[] args) throws IOException {
		TrackingSensor trackingSensor = new TrackingSensor(RaspiPin.GPIO_00);
		ActiveBuzzer activeBuzzer = new ActiveBuzzer(RaspiPin.GPIO_25);
		
		trackingSensor.setGpioPinListenerDigital(e->{
			if(e.getState() == PinState.HIGH){
				activeBuzzer.off();
				System.out.println("Black");
			}else{
				activeBuzzer.on();
				System.out.println("White");
			}
		});
		
		System.out.println("Running");
		System.in.read();
	}
}
