package com.bp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.bp.entity.UseStudent;

@WebService
public class HelloImpl implements Hello {

	@Override
	@WebMethod
	public void sayHello(String name) {
		//这个说明可以通过webservice做排队业务
		System.out.println("studentId:"+UseStudent.getNewInstance().hashCode());
		
		System.out.println("hello :"+name);
	}

	@WebMethod
	public int sayNextNum(int num) {
		return ++num;
	}

	@WebMethod
	public List helloPeople() {
		List peoples = new ArrayList();
		peoples.add("bp1");
		peoples.add("bp2");
		peoples.add("bp3");
		
		return peoples;
	}

	@WebMethod
	public Map peopleInfo() {
		Map peopleInfos = new HashMap();
		
		peopleInfos.put("1", "bp1");
		peopleInfos.put("2", "bp2");
		peopleInfos.put("3", "bp3");
		peopleInfos.put("4", "bp4");
		
		return peopleInfos;
	}

}
