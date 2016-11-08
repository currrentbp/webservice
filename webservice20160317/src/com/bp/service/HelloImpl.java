package com.bp.service;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public class HelloImpl implements Hello {

	@WebMethod
	public String sayHello(String name) {
		System.out.println("name:"+name);
		//访问路径：http://localhost:8989/webservice20160317/hellows?wsdl
		return "hello: "+name;
		
	}

}
