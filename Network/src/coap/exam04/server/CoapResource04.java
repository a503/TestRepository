/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coap.exam04.server;

import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.server.resources.CoapExchange;
import org.json.JSONObject;

/**
 *
 * @author kang
 */
public class CoapResource04 extends CoapResource{
	private int value;
	

	public CoapResource04() {
		super("resource04");
		// 관찰 기능 활성화
		setObservable(true);
		// 관찰 기능을 제공하다라는 것을 클라이언트가 알 수 있또록 설정
		getAttributes().setObservable();
	}

	@Override
	public void handleGET(CoapExchange exchange) {
		exchange.respond("value=" + value);
	}

	@Override
	public void handlePOST(CoapExchange exchange) {
		// 외부에 있는 장치에서 온 데이터를 검사하는 기능 수행
		JSONObject jsonObject = new JSONObject(exchange.getRequestText());
		
		value = jsonObject.getInt("value");
		if(value > 30){
			changed();
		}
		exchange.respond("ok");
	}
	
	
}
