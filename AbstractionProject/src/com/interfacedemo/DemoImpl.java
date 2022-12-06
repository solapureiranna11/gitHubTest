package com.interfacedemo;

public class DemoImpl extends DemoImplParent implements Demo {

	public static void main(String[] args) {
		Demo d = new DemoImpl();
		d.demoMethod(10);
		d.m1();
		Demo.m2();
		
	}

	@Override
	public int demoMethod(int i) {
	    System.out.println(i);
		return 5;
	}





}
