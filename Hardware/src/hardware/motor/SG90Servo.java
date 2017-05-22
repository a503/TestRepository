/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardware.motor;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinPwmOutput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.wiringpi.Gpio;

/**
 *
 * @author kang
 */
public class SG90Servo {
	// Field

	private GpioPinPwmOutput pin;
	private int angle; // 원하는 각도 설정
	private double minStep;
	private double maxStep;

	// Constructor
	public SG90Servo(Pin pinNo) {
		this(pinNo, 8, 27); // 8단계 - 0도, 27단계 - 180도
	}

	public SG90Servo(Pin pinNo, double minStep, double maxStep) { // 단계 구성이 다른 서보 모터를 사용할경우 이 생성자를 사용해라
		GpioController gpioController = GpioFactory.getInstance();

		pin = gpioController.provisionPwmOutputPin(pinNo);

		// 50Hz에 해당하는 PWM 생성.
		Gpio.pwmSetMode(Gpio.PWM_MODE_MS); // M-S 모드로 설정.
		Gpio.pwmSetClock(1920); // 클록수 1920으로 설정.
		Gpio.pwmSetRange(200); // 200단계 설정.

		this.minStep = minStep;
		this.maxStep = maxStep;
	}
	// Method

	public int getAngle() {
		return angle;
	}

	public void setAngle(int angle) {
		if (angle < 0) {
			angle = 0;
		} else if (angle > 180) {
			angle = 180;
		}
		this.angle = angle;

		int step = (int) (minStep + (angle * (maxStep - minStep) / 180.0));
		
		pin.setPwm(step);
	}
	public static void main(String[] args) throws InterruptedException {
		SG90Servo test = new SG90Servo(RaspiPin.GPIO_01);
		
		for(int i=10 ; i <= 170 ; i+= 10){
			test.setAngle(i);
			Thread.sleep(500);
		}
		
		Thread.sleep(1000);
		test.setAngle(10);
	}

}
