package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveWhiteSpacesFromString {

	public static void main(String[] args) {
		
		while(true) {
			
		System.out.println("Want to remove whitespace(Y/N)");
		Scanner scn = new Scanner(System.in);
		String answer = scn.nextLine();
		if(answer.equalsIgnoreCase("Y")) {
		System.out.println("Enter a string");
		String str = scn.nextLine();
		StringBuilder output = new StringBuilder();
		for(char ch:str.toCharArray()) {
			
			if(!Character.isWhitespace(ch)) {
				
				output.append(ch);
			}
		}
		
		System.out.println(output.toString());
	}
		else {
			System.exit(0);
		}
		}
	}

}
