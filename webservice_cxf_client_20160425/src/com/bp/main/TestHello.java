package com.bp.main;

import com.bp.service.HelloImpl;
import com.bp.service.HelloImplService;

public class TestHello {
	
	public static void main(String[] args) {
		HelloImplService helloImplFactory = new HelloImplService();
		
		helloImplFactory.getHelloImplPort().sayHello("111111111");
		
		HelloImpl h = helloImplFactory.getHelloImplPort();
		System.out.println("+++"+h.hashCode());
		HelloImpl h2 = helloImplFactory.getHelloImplPort();
		System.out.println("===="+h2.hashCode());
		
		System.out.println(helloImplFactory.getHelloImplPort().helloPeople());
		
		System.out.println(helloImplFactory.getHelloImplPort().peopleInfo());
		
		
	}

}
