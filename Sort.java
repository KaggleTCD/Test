package com.test;

import java.util.Random;

public class Sort {
	
	
	public static void main(String args[])
	{
	int [] a = {5,1,6,8,2};
	
	for(int i=0;i<a.length;i++) {
		
		System.out.println(a[i]);
	}
	mergeSort(a);
	//bubblSort(a);
	System.out.println("-------------------------------------");
	
}

	private static void mergeSort(int[] a) {
		
		int len = a.length;
		if(len<2) {
			return;
		}
		
		int mid = len/2;
		int left[] = new int[mid];
		int right[] = new int[len-mid];
		
		for(int i=0;i<mid;i++) {
			
			left[i] = a[i];
		}
		
		for(int i=mid;i<len;i++) {
			
			right[i-mid] = a[i];
		}
		
		mergeSort(left);
		
		mergeSort(right);
		merge(left,right,a);
	for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
	}

	private static void merge(int[] left, int[] right, int[] a) {
		
		int leftLength = left.length;
		int rightLength = right.length;
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<leftLength && j< rightLength) {
			
			if(left[i]<=right[j]) {
				
				a[k] = left[i];
				i++;
				k++;
			}
			else {
				
				a[k] = right[j];
				j++;
				k++;
			}
			
			while(i<leftLength) {
				
				a[k] = left[i];
				i++;
				k++;
			}
			while(j<rightLength) {
				
				a[k] = right[j];
				j++;
				k++;
			}
		}
		
	}
	
	private static void bubblSort(int[] a) {
		
		for(int k=0;k<a.length-1;k++) {

		for(int i=0;i<a.length-1;i++) {
			
			if(a[i]>a[i+1]) {
				
				int temp = a[i+1];
				a[i+1]=a[i];
				a[i]=temp;
				
			}
		}
			}
		System.out.println("-------------------------------------");
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
		}
	}

