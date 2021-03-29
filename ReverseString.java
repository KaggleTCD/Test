package com.test;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = scn.nextLine();
		System.out.println("Original string "+string);
		int i = 0;
		int j= string.length();
		j = j-1;
		char[] charArray = string.toCharArray();
		while(i<j) {
			
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			i++;
			j--;
		}
		string = String.valueOf(charArray);
		System.out.println("Reversed string "+string);
		
		String reversedString = "";
		for(int k=string.length()-1;k>=0;k--) {
			
			reversedString+= Character.toString(string.charAt(k));
		}
		System.out.println(reversedString);

	}

}
