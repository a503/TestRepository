/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coap.exam05.client;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapResponse;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.coap.Request;

/**
 *
 * @author kang
 */
public class Coap2CoapClient {
	private CoapClient coapClient;
	
	public Coap2CoapClient(){
		coapClient = new CoapClient();
		coapClient.useCONs();
	}
	
	public String coap2coap(){
		// proxy의 접근 Uri
		coapClient.setURI("coap://localhost:5683/coap2coap");
		// Forward되는 리소스의 통신 방법
		Request request = new Request(CoAP.Code.GET);
		// Forward되는 리소스의 Uri
		
		request.getOptions().setProxyUri("coap://192.168.3.181/resource01");
		//request.getOptions().setProxyScheme(scheme);
		// 통신
		CoapResponse response = coapClient.advanced(request);
		if(response.getCode() == CoAP.ResponseCode.CONTENT){
			return response.getResponseText();
		}else{
			return null;
		}
	}
	public void shuddown(){
		coapClient.shutdown();
	}
	public static void main(String[] args) {
		Coap2CoapClient client =new Coap2CoapClient();
		
		String text = client.coap2coap();
		
		System.out.println("text : " + text);
		
		client.shuddown();
	}
}