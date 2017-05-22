package hardware.sensor;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class UltrasonicSensor {
	private GpioPinDigitalOutput trigPin; // trigger는 Pi 기준으로 출력
	private GpioPinDigitalInput echoPin; // echo는 Pi 기준으로 입력
	
	private int previousDistance;
	private boolean again;
	private int count;
	
	
	public UltrasonicSensor(Pin trigPinNo, Pin echoPinNo){
		GpioController gpioController = GpioFactory.getInstance();
		
		trigPin = gpioController.provisionDigitalOutputPin(trigPinNo, PinState.LOW);
		trigPin.setShutdownOptions(true, PinState.LOW);
		
		echoPin = gpioController.provisionDigitalInputPin(echoPinNo);
		echoPin.setShutdownOptions(true, PinState.LOW);
	}
	
	
	public int getDistance(){
		// 초음파 발신시간 변수, 수신시간 변수
		double start = 0;
		double end = 0;
		// 초음파를 10micro sec동안 발생
		trigPin.high();
		try {
			Thread.sleep(0, 10000);
		} catch (InterruptedException ex) {
			
		}
		trigPin.low();
		
		// echoPin이 high가 될때까지 기다림
		count = 0;
		while(echoPin.isLow()){
			count++;
			if(count>50000){
				return getDistance();
			}
		}
		// 이 반복문이 시작하고 끝나느시간을 측정
		start = System.nanoTime();
		while(echoPin.isHigh()){
			count++;
			if(count>50000){
				return getDistance();
			}
		}
		end = System.nanoTime();
		
		// 편도 시간
		double sec = (end-start)/1000000000/2;
		
		// 거리
		int distance = (int)(sec * 34000);
		// 100이상 튀는값이 있을 경우 다시측정 한다.
		if(again == false && Math.abs(previousDistance-distance)>100){
			again = true;
			getDistance();getDistance(); // dummy read;
			distance = getDistance();
		}else{
			again=false;
		}
		//초과값 검사
		if(distance < 2){
			distance = 2;
		}else if(distance > 400){
			distance = 400;
		}
		previousDistance = distance;
		
		return distance;
	}
	
	public static void main(String[] args) throws InterruptedException {
		UltrasonicSensor test = new UltrasonicSensor(RaspiPin.GPIO_00, RaspiPin.GPIO_01);
		
		while(true){
			int distance = test.getDistance();
			System.out.println("거리(cm) : " + distance + "cm");
			Thread.sleep(1000);
		}
	}
}
