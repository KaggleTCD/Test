package com.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String args[]) {
		
		String s = "82";
		System.out.println(s.charAt(0)-'0'>9);
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "a");
		map.put(10, "b");
		map.put(11, "c");
		map.put(12, "d");
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		List<Entry<Integer, String>> collect = entrySet.stream().filter(m->m.getKey()>5).collect(Collectors.toList());
		for(Entry e:collect) {
			
			System.out.println(e.getValue());
		}
		
		//or
		
		List<String> collect2 = entrySet.stream().filter(m->m.getKey()>5).map(Map.Entry::getValue).collect(Collectors.toList());
		
		for(String s1:collect2) {
			
			System.out.println(s1);
		}
	}
}
