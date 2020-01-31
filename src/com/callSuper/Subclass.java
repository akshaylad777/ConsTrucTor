package com.callSuper;

public class Subclass extends Parentclass {
	
	void Display() {
		System.out.println("Method of Chlid class");
	}
	
	void Printmsg() {
		Display();
		super.Display();
	}
	
	public static void main(String[] args) {
		Subclass sc=new Subclass();
		sc.Printmsg();
	}

}
