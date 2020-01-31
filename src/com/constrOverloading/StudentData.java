package com.constrOverloading;

public class StudentData {
	private int studID;
	private String studName;
	private int studAge;
	
	public StudentData() {
	studID=100;
	studName="Akshay";
	studAge=25;
	
	}
	
	public StudentData(int num1,String str,int num2) {
		studID=num1;
		studName=str;
		studAge=num2;
	}

	public int getStudID() {
		return studID;
	}

	public void setStudID(int studID) {
		this.studID = studID;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getStudAge() {
		return studAge;
	}

	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}
	
	
	
	}

