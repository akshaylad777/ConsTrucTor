package com.constrOverloading;

public class Overloading_Test {
	
	public static void main(String[] args) {
		
		StudentData sd=new StudentData();
		
		System.out.println("Student Name is:"+sd.getStudAge());
		System.out.println("Age of student is:"+sd.getStudName());
		System.out.println("ID of student is:"+sd.getStudID());
		
		StudentData sd1=new StudentData(76,"Akshay",11);
		
		System.out.println("Age of student is:"+sd1.getStudAge());

		System.out.println("Student name is:"+sd1.getStudName());
		System.out.println("ID of student is:"+sd1.getStudID());
		
	}

}
