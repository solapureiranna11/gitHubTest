package com.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo2 {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add(30);
		list.add(30);
		list.add(45);
		list.add(10);
		
		System.out.println(list); //10 30 30 45 10
		
		Set set = new HashSet(list);
		
		System.out.println(set);//10 35 45
		
	}

}
