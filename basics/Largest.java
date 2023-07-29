package com.rays.basics;

public class Largest {

	public static void main(String[] args) {
	int[]arr = {200,250,450,200,36,};
	int a = 0;
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]>a) {
			a = arr[i];
		}
		}
	System.out.println(a);

	}

}
