package com.bp.testPhone;

import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;

public class TestPhoneWsdlClient {

	
	public static void main(String[] args) {
		MobileCodeWS factory = new MobileCodeWS();
		
		MobileCodeWSSoap s = factory.getMobileCodeWSSoap();
		System.out.println(s.getMobileCodeInfo("13761332440", null));//
		System.out.println(s.getMobileCodeInfo("17075733112", null));
		
		
		System.out.println(factory.getMobileCodeWSSoap().getMobileCodeInfo("13260152226", ""));
	}
}
