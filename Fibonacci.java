package com.test;

public class Fibonacci {

	public static void main(String[] args) {
		
		
		int i = 0;
		int j = 1;
		System.out.println(i);
		System.out.println(j);
		int k=1;
		while(k<=3) {
			
			int c=i+j;
			i=j;
			j=c;
			k++;
			System.out.println(c);
		}
		
		//or
		
		int fibo = fibonacci(5);
		System.out.println("-------------------------");
		System.out.println(fibo);

	}

	private static int fibonacci(int i) {
		
		if(i==0) {
			
			return 0;
		}
	if(i==1) {
			
			return 1;
		}
	return fibonacci(i-1)+fibonacci(i-2);
		
	}

}
