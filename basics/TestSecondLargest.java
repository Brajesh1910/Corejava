package com.rays.basics;

public class TestSecondLargest {

	public static void main(String[] args) {
	int[] arr= {11,22,56,34,57};
	int a =0;
	int b=0;
	for (int i  = 0;  i < arr.length;  i++) {
		if (arr[i]>b) {
			a=b;
			b=arr[i];
			
		}
		if (arr[i]<a) {
			a=arr[i];
		}
	}
System.out.println(a);
	}

}
