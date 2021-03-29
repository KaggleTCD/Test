package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmployee {

	public static void main(String args[]) {
	List<Employee> list = new ArrayList<>();
	
	list.add(new Employee(1,"A"));
	list.add(new Employee(4,"C"));
	list.add(new Employee(3,"B"));
	System.out.println(list.toString());
	Collections.sort(list);
	System.out.println(list.toString());
	
	Collections.sort(list,(e1,e2)->e1.getName().compareTo(e2.getName()));
	System.out.println(list.toString());
	}
}
