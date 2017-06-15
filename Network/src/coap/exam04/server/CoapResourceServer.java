/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coap.exam04.server;

import coap.exam02.server.*;
import coap.exam01.server.*;
import java.io.IOException;
import java.net.InetSocketAddress;
import org.eclipse.californium.core.CoapServer;

/**
 *
 * @author kang
 */
public class CoapResourceServer {
	// Field
	private CoapServer coapServer;
	
	// Constructor
	public CoapResourceServer() throws Exception{
		coapServer = new CoapServer();
		InetSocketAddress isa = new InetSocketAddress("192.168.3.40", 5683);
		// CoAP server가 관리하는 Resource 추가
		coapServer.add(new CoapResource01());
		coapServer.add(new CoapResource02());
		coapServer.add(new CoapResource03());
		coapServer.add(new CoapResource04());
		coapServer.add(new CoapResource05());
		coapServer.add(new CoapResource06());
		// Server 시작
		coapServer.start();
	}
	
	// Method
	public void shutdown(){
		coapServer.stop();
		coapServer.destroy();
	}
	
	public static void main(String[] args) throws Exception {
		// Server 구동
		CoapResourceServer server = new CoapResourceServer();
		System.out.println("CoAP server is listening on Port : 5683"); // 5683, CoAP의 기본 포트, 변경하고 싶으면 생성자에서 포트 번호를 주면서 생성, 하지만 개방형 장치에서는 변경하지 않는다.
		System.in.read();
		server.shutdown();
	}
	
}
