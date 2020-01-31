package com.childParent;

public class Subclass extends Parent {
	
  Subclass() {
		System.out.println("Constructor of Subclass");
		// TODO Auto-generated constructor stub
	}
  Subclass(int num) {
		System.out.println("Constructor with args");
		// TODO Auto-generated constructor stub
	}
  
  void Display() {
	  System.out.println("Hello");
  }
  
  public static void main(String[] args) {
	
	  Subclass sc=new Subclass();
	  sc.Display();
	  
	  Subclass sc1=new Subclass();
	  sc1.Display();
	  
		  
}
	

}
