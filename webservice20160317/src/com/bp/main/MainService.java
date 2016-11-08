package com.bp.main;

import javax.xml.ws.Endpoint;

import com.bp.service.HelloImpl;

public class MainService {

	
	public static void main(String[] args) {
		String address = "http://localhost:8989/webservice20160317/hellows";
		
		Endpoint.publish(address, new HelloImpl());
		
		System.out.println("ok....");
	}
}
