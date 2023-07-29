package com.rays.basics;

public class Reverse {

	public static void main(String[] args) {
	int  n = 425643;
	  int r = 0;
	for (int  i = 0; i < n; i++) {
		r = n % 10;
		System.out.print(r);
		n = n/10;
		
	}

	}

}
