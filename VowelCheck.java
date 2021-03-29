package com.test;

import java.util.Scanner;

public class VowelCheck {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string");
		String word = scn.nextLine();
		if(word.contains("a")||word.contains("e")||word.contains("i")||word.contains("o")||word.contains("u")) {
			
			System.out.println("Has vowels");
		}
		else {
			
			System.out.println("Does not contain vowels");
		}
	}

}
