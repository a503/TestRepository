package hardware.lcd;

import com.pi4j.io.i2c.I2CBus;
import com.pi4j.io.i2c.I2CDevice;
import com.pi4j.io.i2c.I2CFactory;
import com.pi4j.wiringpi.Gpio;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

public class LCD1602 {
	private I2CDevice i2cDevice;
	private int blen = 1;
	private String[] textArray = new String[2]; // row 수

	public LCD1602(int i2cAddress) throws Exception {
		I2CBus i2cBus = I2CFactory.getInstance(I2CBus.BUS_1); // PI에서는 1번만 사용할 수 있다
		i2cDevice = i2cBus.getDevice(i2cAddress); // i2cAddress는 고정이 아니다, pi에서는 27번이 나온다
		init();
	}

	void init() throws Exception { // 초기화, 장비가 가지고있는 행의 수대로 초기화
		send_command(0x33);	// Must initialize to 8-line mode at first
		Gpio.delay(5);
		send_command(0x32);	// Then initialize to 4-line mode
		Gpio.delay(5);
		send_command(0x28);	// 2 Lines & 5*7 dots
		Gpio.delay(5);
		send_command(0x0C);	// Enable display(Turn On)
		Gpio.delay(5);
		send_command(0x01);	// Clear Screen
	}

	private void send_command(int comm) throws Exception {// datasheet에 있는 명령어에 맞게 명령 byte배열 만들기
		int buf;
		// Send bit7-4 firstly
		buf = comm & 0xF0;
		buf |= 0x04;			// RS = 0, RW = 0, EN = 1
		write_word(buf);
		Gpio.delay(2);
		buf &= 0xFB;			// Make EN = 0
		write_word(buf);

		// Send bit3-0 secondly
		buf = (comm & 0x0F) << 4;
		buf |= 0x04;			// RS = 0, RW = 0, EN = 1
		write_word(buf);
		Gpio.delay(2);
		buf &= 0xFB;			// Make EN = 0
		write_word(buf);
	}
	//실제 장비로 명령 전달(바이트 배열)
	private void write_word(int data) throws Exception {
		int temp = data;
		if (blen == 1) {
			temp |= 0x08;
		} else {
			temp &= 0xF7;
		};
		i2cDevice.write((byte) temp);
	}
	// text를 보내는 메소드
	private void send_data(int data) throws Exception {
		int buf;
		// Send bit7-4 firstly
		buf = data & 0xF0;
		buf |= 0x05;			// RS = 1, RW = 0, EN = 1
		write_word(buf);
		Gpio.delay(2);
		buf &= 0xFB;			// Make EN = 0
		write_word(buf);

		// Send bit3-0 secondly
		buf = (data & 0x0F) << 4;
		buf |= 0x05;			// RS = 1, RW = 0, EN = 1
		write_word(buf);
		Gpio.delay(2);
		buf &= 0xFB;			// Make EN = 0
		write_word(buf);
	}
	// 줄수를 파악하고, 보여줄 text 전달
	public void write(int line, int column, String text) {
		try {
			char data[] = text.toCharArray();
			int addr, i;
			int tmp;
			if (column < 0) {
				column = 0;
			}
			if (column > 15) {
				column = 15;
			}
			if (line < 0) {
				line = 0;
			}
			if (line > 1) {
				line = 1;
			}

			// Move cursor
			addr = 0x80 + 0x40 * line + column;
			send_command(addr);

			tmp = data.length;
			for (i = 0; i < tmp; i++) {
				send_data(data[i]);
			}

			textArray[line] = text;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// lcd화면에 나오는 출력삭제
	public void clear() {
		try {
			send_command(0x01);
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String[] getTextArray() {
		return textArray;
	}

	public static void main(String[] args) throws Exception {
		LCD1602 lcd1602 = new LCD1602(0x27);

		lcd1602.write(0, 0, "Current Time");
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		for (int i = 0; i < 10; i++) {
			lcd1602.write(1, 0, formatter.format(new Date()));
			Thread.sleep(1000);
		}
		lcd1602.clear();
		displayIPaddress(lcd1602);
		Thread.sleep(5000);

		//lcd1602.clear();
	}
	// 장비의 ip주소 가져오기
	public static void displayIPaddress(LCD1602 lcd) throws Exception {
		Enumeration<NetworkInterface> niEnum = NetworkInterface.getNetworkInterfaces();
		while (niEnum.hasMoreElements()) {
			NetworkInterface ni = niEnum.nextElement();
			String displayName = ni.getDisplayName();
			if (displayName.equals("wlan0")) {
				Enumeration<InetAddress> iaEnum = ni.getInetAddresses();
				while (iaEnum.hasMoreElements()) {
					InetAddress ia = iaEnum.nextElement();
					if (ia instanceof Inet4Address) {
						String text = "R:" + ia.getHostAddress();
						lcd.write(0, 0, text);
					}
				}
			} else if (displayName.equals("wlan1")) {
				Enumeration<InetAddress> iaEnum = ni.getInetAddresses();
				while (iaEnum.hasMoreElements()) {
					InetAddress ia = iaEnum.nextElement();
					if (ia instanceof Inet4Address) {
						String text = "A:" + ia.getHostAddress();
						lcd.write(1, 0, text);
					}
				}
			}
		}
	}
}
