package com.demo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo2 {
	
	public static void main(String[] args) {
		Set< Integer> set = new LinkedHashSet<>();
		set.add(78);
		set.add(56);
		set.add(67);
		
		
		
		
		
		for(Integer i : set) {
			System.out.println(i);
		}
		
		System.out.println("Using iterator:");
		Iterator< Integer> itr=set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
	}

}
