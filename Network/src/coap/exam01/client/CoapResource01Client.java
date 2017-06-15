/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coap.exam01.client;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapResponse;
import org.eclipse.californium.core.coap.CoAP;

/**
 *
 * @author kang
 */
public class CoapResource01Client {
	private CoapClient coapClient;
	
	public CoapResource01Client(){
		coapClient = new CoapClient();
	}
	
	//요청 전송
	public String get(){
		coapClient.setURI("coap://192.168.3.40/resource01"); // 포트번호를 생략하면 디폴트로 5683으로 보낸다. //
		CoapResponse response = coapClient.get(); // 요청방식 설정.
		
		if(response.getCode() == CoAP.ResponseCode.CONTENT/*2.05*/){ // 2.05(content), 응답 내용(Payload)가 있는 응답, 보통 상수로 사용.
			return response.getResponseText();
		}else{
			return null;
		}
	}
	public void shutdown(){
		coapClient.shutdown();
	}
	public static void main(String[] args) {
		CoapResource01Client client = new CoapResource01Client();
		
		String text = client.get();
		
		System.out.println("응답 내용 -> " + text);
		
		client.shutdown();
	}
}
