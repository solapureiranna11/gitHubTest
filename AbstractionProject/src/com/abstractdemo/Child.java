package com.abstractdemo;

public  class Child extends Parent{

	@Override
	public void test() {
		System.out.println("child-test.");
	}
	
	public static void main(String[] args) {
		Parent p = new Child();
		p.test();
		
		Parent p2 = new Child2();
		p2.test();
		
		
	}
	
	

}
