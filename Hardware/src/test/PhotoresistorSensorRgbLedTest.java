package test;

import com.pi4j.io.gpio.RaspiPin;
import hardware.converter.PCF8591;
import hardware.led.RgbLedDigital;
import hardware.sensor.PhotoresistorSensor;

public class PhotoresistorSensorRgbLedTest {
		
	public static void main(String[] args) throws Exception {
		PCF8591 pcf8591 = new PCF8591(0x48, PCF8591.AIN0);
		PhotoresistorSensor photoresistorSensor = new PhotoresistorSensor(pcf8591);
		RgbLedDigital rgbLedDigital = new RgbLedDigital(RaspiPin.GPIO_00, RaspiPin.GPIO_02, RaspiPin.GPIO_03);
		
		double value = 0;
		
		while(true){
			value = photoresistorSensor.getValue();
			if(value < 100){
				rgbLedDigital.rgb(true, false, false);
			}else if(value >= 100 && value < 200){
				rgbLedDigital.rgb(false, true, false);
			}else{
				rgbLedDigital.rgb(false, false, true);
			}
		}
	}
		
}
