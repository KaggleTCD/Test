package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListContainingOnlyOddNumbers {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the number of numbers");
		
		int numberOfNumbers = scn.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<numberOfNumbers;i++) {
			
			System.out.println("Enter the number");
			int number = scn.nextInt();
			list.add(number);
		}
		
		List<Integer> oddNumbers = list.stream().filter(m->m%2!=0).collect(Collectors.toList());
		System.out.println(oddNumbers.toString());

	}

}
