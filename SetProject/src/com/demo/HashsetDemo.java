package com.demo;

import java.util.HashSet;

public class HashsetDemo {
	/*duplicates are not allowed
	   insertion order is not preserved.
	   null insertion is possible
	   heterogeneous elements are possible.*/
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		boolean result1=set.add("abc");
		boolean result2=set.add("abc");
		set.add(null);
		set.add('a');
		set.add(10);
		
		System.out.println(result1);
		System.out.println(result2);

		
		
		System.out.println(set);
		
	}

}
