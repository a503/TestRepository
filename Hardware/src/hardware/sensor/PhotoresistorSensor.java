package hardware.sensor;

import hardware.converter.PCF8591;

public class PhotoresistorSensor {
	private PCF8591 pcf8591;
	
	public PhotoresistorSensor(PCF8591 pcf8591){
		this.pcf8591 = pcf8591;
	}
	public double getValue() throws Exception{
		int analogVal = pcf8591.analogRead(); // 0~255
		return analogVal;
	}
	public static void main(String[] args) throws Exception {
		PCF8591 pcf8591 = new PCF8591(0x48, PCF8591.AIN0);
		PhotoresistorSensor test = new PhotoresistorSensor(pcf8591);
		
		while(true){
			double value = test.getValue();
			System.out.println("value : " + value);
			Thread.sleep(1000);
		}
	}
}
