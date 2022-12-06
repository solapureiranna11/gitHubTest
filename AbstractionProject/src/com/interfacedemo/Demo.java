package com.interfacedemo;

public interface Demo {
	

	  
	   int demoMethod(int i);
	   
	   default void m1() {
		   System.out.println("default- m1");
	   }
	   
	   static void m2() {
		   System.out.println("static - m2");
	   }
	   
	
	  
	  
}
