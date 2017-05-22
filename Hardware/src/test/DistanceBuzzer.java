package test;

import com.pi4j.io.gpio.RaspiPin;
import hardware.buzzer.ActiveBuzzer;
import hardware.sensor.UltrasonicSensor;

public class DistanceBuzzer {
	public static void main(String[] args) {
		ActiveBuzzer activeBuzzer = new ActiveBuzzer(RaspiPin.GPIO_25);
		UltrasonicSensor ultrasonicSensor = new UltrasonicSensor(RaspiPin.GPIO_00, RaspiPin.GPIO_01);
		
		while(true){
			int distance = ultrasonicSensor.getDistance();
			if(distance <= 20){
				activeBuzzer.on();
				System.out.println("거리(cm) : " + distance + "cm");
			}else{
				activeBuzzer.off();
				System.out.println("거리(cm) : " + distance + "cm");
			}
		}
	}
}
