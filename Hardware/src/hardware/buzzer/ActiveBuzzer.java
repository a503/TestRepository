/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardware.buzzer;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

/**
 *
 * @author kang
 */
public class ActiveBuzzer {
	//field
	private GpioPinDigitalOutput buzzerPin;
	private String status = "OFF";

	public ActiveBuzzer(Pin buzzerPinNo) {
		GpioController gpioController = GpioFactory.getInstance();
		buzzerPin = gpioController.provisionDigitalOutputPin(buzzerPinNo, PinState.HIGH);
		buzzerPin.setShutdownOptions(false, PinState.HIGH);
	}
	public void on(){
		buzzerPin.low();
		status = "ON";
	}
	public void off(){
		buzzerPin.high();
		status = "OFF";
	}
	public String getStatus(){
		return status;
	}
	
	public static void main(String[] args) throws InterruptedException{
		ActiveBuzzer test = new ActiveBuzzer(RaspiPin.GPIO_00);
		
		for(int i = 0 ; i < 5 ; i++){
			test.on();
			Thread.sleep(1000);
		}
	}
}
