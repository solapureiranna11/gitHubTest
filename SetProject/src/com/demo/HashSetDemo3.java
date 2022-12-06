package com.demo;

import java.util.HashSet;

public class HashSetDemo3 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(null);
		set.add('a');
		set.add(10);
		set.add("pune");
		System.out.println(set); // abc, null,a, 10, pune

		set.remove("pune");
	
		System.out.println(set);// abc, null,a, 10
		
		System.out.println(set.contains("abc"));//
		System.out.println(set.size());//
		
		HashSet hashset2 = new HashSet<>();
		hashset2.add(50);
		hashset2.addAll(set);
		
		System.out.println(hashset2);//
		
		
		
	}

}
