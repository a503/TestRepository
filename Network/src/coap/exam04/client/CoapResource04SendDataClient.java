/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coap.exam04.client;

import java.util.Random;
import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.coap.MediaTypeRegistry;
import org.json.JSONObject;

/**
 *
 * @author kang
 */
public class CoapResource04SendDataClient {
	private CoapClient coapClient;
	
	public CoapResource04SendDataClient(){
		coapClient = new CoapClient();
		coapClient.useNONs();
	}
	
	public void post() throws InterruptedException{
		coapClient.setURI("coap://192.168.3.40/resource04");
		Random random = new Random();
		while(true){
			JSONObject jsonObect = new JSONObject();
			
			jsonObect.put("value", random.nextInt(35));
			
			String json = jsonObect.toString();
			
			coapClient.post(json, MediaTypeRegistry.APPLICATION_JSON);
			
			Thread.sleep(1000);
		}
	}
	
	public void shutdown(){
		coapClient.shutdown();
	}
	
	public static void main(String[] args) throws InterruptedException {
		CoapResource04SendDataClient client = new CoapResource04SendDataClient();
		
		client.post();
		client.shutdown();
	}
}
