/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coap.exam02.client;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapResponse;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.coap.MediaTypeRegistry;
import org.json.JSONObject;

/**
 *
 * @author kang
 */
public class CoapResource02Client {
	private CoapClient coapClient;
	
	public CoapResource02Client(){
		coapClient = new CoapClient();
		coapClient.useCONs(); // default
		//coapClient.useNONs();
	}
	
	//요청 전송
	public String get(String kind, int angle){
		//String queryString = "key1=value1&key2=value2";
		String queryString = "kind=" + kind + "&angle=" + angle;
		coapClient.setURI("coap://192.168.3.40/resource02?" + queryString); // 포트번호를 생략하면 디폴트로 5683으로 보낸다. //
		CoapResponse response = coapClient.get(); // 요청방식 설정.
		if(response == null){
			return get(kind, angle);
		}else{
			if(response.getCode() == CoAP.ResponseCode.CONTENT/*2.05*/){ // 2.05(content), 응답 내용(Payload)가 있는 응답, 보통 상수로 사용.
				return response.getResponseText();
			}else{
				return get(kind, angle);
			}
		}
	}
	
	public String post(String kind, int angle){
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("kind", kind);
		jsonObject.put("angle", angle);
		
		String json = jsonObject.toString();
		
		coapClient.setURI("coap://192.168.3.40/resource02"); // 포트번호를 생략하면 디폴트로 5683으로 보낸다. //
		CoapResponse response = coapClient.post(json, MediaTypeRegistry.APPLICATION_JSON); // 요청방식 설정.
		if(response == null){
			return get(kind, angle);
		}else{
			if(response.getCode() == CoAP.ResponseCode.CONTENT/*2.05*/){ // 2.05(content), 응답 내용(Payload)가 있는 응답, 보통 상수로 사용.
				return response.getResponseText();
			}else{
				return get(kind, angle);
			}
		}
	}
	
	public void shutdown(){
		coapClient.shutdown();
	}
	public static void main(String[] args) {
		CoapResource02Client client = new CoapResource02Client();
		
		
		for(int i = 30; i <= 140 ; i+= 10){
			//String text = client.get("ultrasonicsensor", i);
			String text = client.post("ultrasonicsensor", i);
			System.out.println(i + "각도 | Distance -> " + text);
		}
		
		client.shutdown();
	}
}
