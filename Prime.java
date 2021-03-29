package com.test;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scn.nextInt();
		int sqrt = (int)Math.sqrt(num);
		boolean isPrime = true;
		for(int i=2;i<=sqrt;i++) {
			
			if(num%i==0) {
				isPrime = false;
			}
		}
		System.out.println(isPrime?"Prime":"Not prime");

	}

}
