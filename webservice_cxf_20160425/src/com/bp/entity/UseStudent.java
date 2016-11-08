package com.bp.entity;

public class UseStudent {

	private static Student student;
	
	
	public static Student getNewInstance(){
		
		if(null == student){
			return student = new Student(1,"student1","address1");
		}else{
			return student;
		}
	}
	
	
}
