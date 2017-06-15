/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coap.exam05.server;

import coap.exam04.server.*;
import coap.exam02.server.*;
import coap.exam01.server.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import org.eclipse.californium.core.CoapServer;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.network.CoapEndpoint;
import org.eclipse.californium.core.network.EndpointManager;
import org.eclipse.californium.proxy.DirectProxyCoapResolver;
import org.eclipse.californium.proxy.ProxyHttpServer;
import org.eclipse.californium.proxy.resources.ForwardingResource;
import org.eclipse.californium.proxy.resources.ProxyCoapClientResource;

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
//		InetSocketAddress isa = new InetSocketAddress("192.168.3.40", 5683);
//		coapServer.addEndpoint(new CoapEndpoint(isa));

		for(InetAddress addr : EndpointManager.getEndpointManager().getNetworkInterfaces()){
			if(!addr.isLinkLocalAddress()){
				coapServer.addEndpoint(new CoapEndpoint(new InetSocketAddress(addr, CoAP.DEFAULT_COAP_PORT)));
			}
		}
		
		// CoAP server가 관리하는 Resource 추가
		coapServer.add(new CoapResource01());
		coapServer.add(new CoapResource02());
		coapServer.add(new CoapResource03());
		coapServer.add(new CoapResource04());
		coapServer.add(new CoapResource05());
		coapServer.add(new CoapResource06());
		
		// coap -> coap 포워드 프록시 설정
		ForwardingResource coap2coap = new ProxyCoapClientResource("coap2coap");
		coapServer.add(coap2coap);
		
		// http->coap
		ProxyHttpServer httpServer = new ProxyHttpServer(9090);
		httpServer.setProxyCoapResolver(new DirectProxyCoapResolver(coap2coap));
		
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
