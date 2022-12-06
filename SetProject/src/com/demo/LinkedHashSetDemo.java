package com.demo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add("ram");
		set.add('a');
		set.add(null);
		set.add(10);
		set.add(10);
		
		System.out.println(set);
		
		for(Object o : set) {
			System.out.println(o);
		}
		
	}

}
