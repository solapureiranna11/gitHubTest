package com.abstractdemo;

public abstract class Parent {
	
	 Parent(){
		 System.out.println("Parent - Constructor");
	 }
	
	 abstract void test();
	 
	 void show() {
		 System.out.println("show..");
	 }
	 
	 public static void main(String[] args) {
		Parent p = new Child();
		p.show();
	}

}
