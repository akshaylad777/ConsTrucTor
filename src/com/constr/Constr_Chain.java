package com.constr;

public class Constr_Chain {
	public Constr_Chain() {
		
		System.out.println("Default Constructor");
	}
	
	public Constr_Chain(String str) {
		this();
		System.out.println("Parameterized constructor with single parameter");
	}
	
	public Constr_Chain(String str,int num) {
		this("Hello");
		System.out.println("Parameterized constructor with double Arguments");
		
	}
	
	public Constr_Chain(int num1,int num2,int num3) {
		this("Hello",2);
		System.out.println("Parameterized constructor with three arguments");
	}

	
	
	public static void main(String[] args) {
		
		Constr_Chain ch=new Constr_Chain(43,65,98);
/*//		Constr_Chain ch1=new Constr_Chain("Akshay");
//		Constr_Chain ch2=new Constr_Chain("Akshu", 143);
//		Constr_Chain ch3=new Constr_Chain();
*/		
	}
}
