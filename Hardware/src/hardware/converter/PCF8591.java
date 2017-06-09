/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardware.converter;

import com.pi4j.io.i2c.I2CBus;
import com.pi4j.io.i2c.I2CDevice;
import com.pi4j.io.i2c.I2CFactory;

/**
 *
 * @author kang
 */
public class PCF8591 {
	// Field
	// analog input pin이 4개 있다
	public static final int AIN0 = 0x40;
	public static final int AIN1 = 0x41;
	public static final int AIN2 = 0x42;
	public static final int AIN3 = 0x43;

	private int i2cAddress; // i2c 통신 주소
	private int ainNo; 
	private int analogVal; //아날로그 값 저장 목적

	// Constructor
	public PCF8591(int i2cAddress, int ainNo) {
		this.i2cAddress = i2cAddress; // 장치번호
		this.ainNo = ainNo; // 핀 번호 받기
	}

	// Method
	public int analogRead() throws Exception {
		I2CBus i2cBus = I2CFactory.getInstance(I2CBus.BUS_1);
		I2CDevice i2cDevice = i2cBus.getDevice(i2cAddress);

		i2cDevice.read(ainNo); // dummy read
		analogVal = i2cDevice.read(ainNo); // 0~255 범위를 가진다.

		return analogVal;
	}

	public void analogWrite(byte value) throws Exception {
		I2CBus i2cBus = I2CFactory.getInstance(I2CBus.BUS_1);
		I2CDevice i2cDevice = i2cBus.getDevice(i2cAddress);
		
		i2cDevice.write(AIN0, value);
	}
	
	public static void main(String[] args) throws Exception{
		PCF8591 test = new PCF8591(0x48, PCF8591.AIN0);
		while(true){
			// 아날로그 값 일기
			int value = test.analogRead();
			System.out.println("value : " + value);
			
			test.analogWrite((byte)value);
			Thread.sleep(300);
		}
	}
}
