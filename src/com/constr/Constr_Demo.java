package com.constr;

public class Constr_Demo {
	
	public Constr_Demo() {
		System.out.println("Constructor Running");
	}

	public Constr_Demo(int a) {
		
		System.out.println("Constuctor Running"+a);
	}
	
	public static void main(String[] args) {
		Constr_Demo cd=new Constr_Demo();
		
		Constr_Demo cd1=new Constr_Demo(11);
	}
}
