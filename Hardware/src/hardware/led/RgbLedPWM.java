package hardware.led;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinPwmOutput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.RaspiPin;
import java.io.IOException;

public class RgbLedPWM {
	// Field

	private GpioPinPwmOutput redPin;
	private GpioPinPwmOutput greenPin;
	private GpioPinPwmOutput bluePin;
	
	private int[] currColorSet = new int[3];

	// Constructor
	public RgbLedPWM(Pin redPinNo, Pin greenPinNo, Pin bluePinNo) {

		GpioController gpioController = GpioFactory.getInstance();

		redPin = gpioController.provisionSoftPwmOutputPin(redPinNo); // 소프트웨어 PWM 출력 핀 단계 객체 생성
		redPin.setPwmRange(255); // 제어 단계를 255단계로 변경, 실제 밝기의 단계는 255단계는아니다, 발광하기 위해서 최소한의 단계가 필요하기 때문에
//		redPin.setPwm(255); // 발광하지 않도록 초기화 // 255가 발광이 안되는
		
		greenPin = gpioController.provisionSoftPwmOutputPin(greenPinNo);
		greenPin.setPwmRange(255);
//		greenPin.setPwm(255);

		bluePin = gpioController.provisionSoftPwmOutputPin(bluePinNo);
		bluePin.setPwmRange(255);
//		bluePin.setPwm(255);
		
		ledColorSet(0, 0, 0);

	}

	// Method
	
	public void ledColorSet(int r, int g, int b){
		currColorSet[0] = r;
		currColorSet[1] = g;
		currColorSet[2] = b;
		
		r = 255 - r;
		g = 255 - g;
		b = 255 - b;
		
		redPin.setPwm(r);
		greenPin.setPwm(g);
		bluePin.setPwm(b);
		
		
	}
	// 외부에서 현재 rgb값이 얼마인지 알아오는 메소드
	public int[] getCurrColorSet() {
		return currColorSet;
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		RgbLedPWM test = new RgbLedPWM(RaspiPin.GPIO_00, RaspiPin.GPIO_02, RaspiPin.GPIO_03);
		
//		for(int r = 0 ; r <= 255 ; r ++ ){
//			for(int g = 0 ; g <= 255 ; g ++ ){
//				for(int b = 0 ; b <= 255 ; b ++ ){
//					test.red(r);
//					test.green(g);
//					test.blue(b);
//					Thread.sleep(10);
//				}
//			}
//		}
		test.ledColorSet(255, 0, 0); Thread.sleep(500);
		test.ledColorSet(0, 255, 0); Thread.sleep(500);
		test.ledColorSet(0, 0, 255); Thread.sleep(500);
		test.ledColorSet(255, 255, 0); Thread.sleep(500);
		test.ledColorSet(0, 255, 255); Thread.sleep(500);
		test.ledColorSet(255, 0, 255); Thread.sleep(500);
		
		
		Thread.sleep(500);
		test.ledColorSet(0, 0, 0);
		
		System.out.println("Ready...");
		System.in.read();
	}

}
