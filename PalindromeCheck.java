package com.test;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		while(true) {
		System.out.println("Want to check palindrome(Y/N)");
		Scanner scn = new Scanner(System.in);
		String yesNo = scn.nextLine();
		if(yesNo.equalsIgnoreCase("Y")) {
		System.out.println("Enter a string");
		String str = scn.nextLine();
		int len = str.length()-1;
		int i=0;
		boolean isPalindrome = true;
		while(i<len) {
			
			if(str.charAt(i)!=str.charAt(len)) {
				
				isPalindrome=false;
				break;
			}
			i++;
			len--;
		}
		System.out.println(isPalindrome?"Palindrome":"Not palindrome");
	}
		else {
			
			System.exit(0);
		}
	}
	}

}
