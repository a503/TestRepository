/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coap.exam01.server;

import hardware.converter.PCF8591;
import hardware.sensor.ThermistorSensor;
import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.server.resources.CoapExchange;

/**
 *
 * @author kang
 */
// Resource들은 클라이언트의 요청이오면 센서에서는 정보를 클라이언트로 전달해주거나, 본인이 동작해야 한다.
public class CoapResource01 extends CoapResource{ // 항상 CoapResource를 상속받아야 한다.
	private ThermistorSensor thermistorSensor;
	
	public CoapResource01() {
		super("resource01"); // resource 식별 이름
		
		PCF8591 pcf8591 = new PCF8591(0x48, PCF8591.AIN1);
		thermistorSensor = new ThermistorSensor(pcf8591);
	}

	@Override
	public void handleGET(CoapExchange exchange) {
		try {
			//exchange.respond("온도: 섭씨 25도");
			double value = thermistorSensor.getValue();
			exchange.respond("온도: 섭씨" + value + "도");
		} catch (Exception ex) {
			
		}
		
		
	}
	
}
