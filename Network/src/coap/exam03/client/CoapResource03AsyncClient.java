/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coap.exam03.client;

import coap.exam02.client.*;
import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapHandler;
import org.eclipse.californium.core.CoapResponse;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.coap.MediaTypeRegistry;
import org.json.JSONObject;

/**
 *
 * @author kang
 */
public class CoapResource03AsyncClient {
	private CoapClient coapClient;
	
	public CoapResource03AsyncClient(){
		coapClient = new CoapClient();
		//coapClient.useCONs(); // default
		coapClient.useNONs();
	}
	
	//요청 전송
	public void get(String kind, int angle){
		//String queryString = "key1=value1&key2=value2";
		String queryString = "kind=" + kind + "&angle=" + angle;
		coapClient.setURI("coap://192.168.3.40/resource02?" + queryString); // 포트번호를 생략하면 디폴트로 5683으로 보낸다. //
		
		coapClient.get(new CoapHandler() {
			@Override
			public void onLoad(CoapResponse response) {				
				if(response.getCode() == CoAP.ResponseCode.CONTENT/*2.05*/){ // 2.05(content), 응답 내용(Payload)가 있는 응답, 보통 상수로 사용.
					String text = response.getResponseText();
					System.out.println(angle +  "각도 | Distance -> " + text);
				}
			}

			@Override
			public void onError() {
			}
		});
	}
	
	public void post(String kind, int angle){
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("kind", kind);
		jsonObject.put("angle", angle);
		
		String json = jsonObject.toString();
		
		coapClient.setURI("coap://192.168.3.40/resource02"); // 포트번호를 생략하면 디폴트로 5683으로 보낸다. //
		
		coapClient.post(new CoapHandler() {
			@Override
			public void onLoad(CoapResponse response) {
				if(response.getCode() == CoAP.ResponseCode.CONTENT/*2.05*/){ // 2.05(content), 응답 내용(Payload)가 있는 응답, 보통 상수로 사용.
					String text = response.getResponseText();
					System.out.println(angle +  "각도 | Distance -> " + text);
				}
			}
			@Override
			public void onError() {
				
			}
		}, json, MediaTypeRegistry.APPLICATION_JSON);
	}
	
	public void shutdown(){
		coapClient.shutdown();
	}
	public static void main(String[] args) throws Exception {
		CoapResource03AsyncClient client = new CoapResource03AsyncClient();
		
		for(int i = 30; i <= 140 ; i+= 10){
			//String text = client.get("ultrasonicsensor", i);
			client.post("ultrasonicsensor", i);
			Thread.sleep(1000);
		}
		System.in.read();
		client.shutdown();
	}
}
