package com.singletonclass;

public class MySingleton {
	private static MySingleton myObj;
	
	
	private MySingleton() {
		
		
		
	}
		
		public static MySingleton getInstance() {
			if(myObj==null) {
				myObj=new MySingleton();
				
			}
			return myObj;	
	}




public void GETSomething() {
	System.out.println("I m Here");
	
}


public static void main(String[] args) {
	
	MySingleton mc=new MySingleton();
	mc.GETSomething();
}
}