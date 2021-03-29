package com.test;

public class BinarySearch {

	public static void main(String[] args) {
		
		int [] a = {1,2,5,6,8};
		
		int binarySearch = binarySearch(a,2);
		System.out.println(binarySearch);

	}

	private static int binarySearch(int[] a,int x) {
		
		int len = a.length;
		int start = 0;
		
		while(start<=len) {
			
			int mid = (start+len)/2;
			if(x==a[mid]) {
				return mid;
			}
			else if(x<a[mid]){
				
				len = mid-1;
				
			}
			else {
				
				start = mid+1;
			}
		}
		return -1;
		
	}

}
