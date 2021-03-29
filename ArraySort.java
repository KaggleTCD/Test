package com.test;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		char ch[] = {'Z', 'C', 'a', 'Q', 'B', 'g'};
		Character charcterWrapper[] = new Character[ch.length];
		for(int i=0;i<ch.length;i++) {
			
			charcterWrapper[i] = Character.valueOf(ch[i]);
		}
		System.out.println(ch);//ZCaQBg
		Arrays.sort(ch);
		System.out.println(ch);//BCQZag
		//This will sort the capital letters first
		//as they have lower ASCII values.
		Arrays.sort(charcterWrapper,(c1,c2)->Character.toLowerCase(c1)-Character.toLowerCase(c2));
		for(int i=0;i<ch.length;i++) {
			
			ch[i] = charcterWrapper[i];
		}
		
		System.out.println(ch);//aBCgQZ
	}

}
