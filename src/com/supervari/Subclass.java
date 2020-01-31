package com.supervari;

public class Subclass extends ParentClass {
	int num=110;
	
	
	void PrintNumber() {
		System.out.println(super.num);
		
	}
	
	public static void main(String[] args) {
		Subclass sb=new Subclass();
		sb.PrintNumber();
	}

}
