package com.test;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num = 0;
		
		System.out.println("Enter a number");
		Scanner scn = new Scanner(System.in);
		//Hey what is the difference between
		//Scanner and BufferedStreamReader?
		num = scn.nextInt();
		
		int x = num;
		int sum = 0;
		
		while(x!=0) {
			
			int rem = x%10;
			sum = sum+(rem*rem*rem);
			x=x/10;
		}
		
		if(sum==num) {
			
			System.out.println("Armstrong");
		}
		else {
			
			System.out.println("Not Armstrong");
		}

	}

}
