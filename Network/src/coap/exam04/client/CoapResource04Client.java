/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coap.exam04.client;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapHandler;
import org.eclipse.californium.core.CoapObserveRelation;
import org.eclipse.californium.core.CoapResponse;

/**
 *
 * @author kang
 */
public class CoapResource04Client {
	private CoapClient coapClient;
	private CoapObserveRelation coapObserveRelation;
	
	public CoapResource04Client(){
		coapClient = new CoapClient();
		coapClient.useNONs();
	}
	
	public void observe(){
		coapClient.setURI("coap://192.168.3.40/resource04");
		coapObserveRelation = coapClient.observe(new CoapHandler() {
			@Override
			public void onLoad(CoapResponse response) {
				// 통보 메시지가 왔을때 실행된다.
				String text = response.getResponseText();
				System.out.println(text);
			}

			@Override
			public void onError() {
				// 네트워크 불능
			}
		});
	}
	
	public void shutdown(){
		// 관찰기능 중지
		coapObserveRelation.proactiveCancel();
		coapClient.shutdown();
	}
	
	public static void main(String[] args) throws Exception {
		CoapResource04Client client = new CoapResource04Client();
		
		client.observe();
		System.in.read();
		client.shutdown();
	}
}
