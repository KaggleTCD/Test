package com.test;

public class FizzBuzz {

	public static void main(String[] args) {
		
		for(int i=1;i<=50;i++) {
			
			System.out.println((i%(5*3)==0?"FizzBuzz":i%5==0?"Buzz":i%3==0?"Fizz":i));
		}

	}

}
