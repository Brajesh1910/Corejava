package com.rays.basics;

public class Armstrong {

	public static void main(String[] args) {
    int number = 371;
    int sum = 0;
    int r ;
    int n = number;
    while(n>0) {
    	r=n%10;
    	sum = sum +(r*r*r);
    	n=n/10;
    }
    if (sum==number) {
    	System.out.println("yes, it is an Armstrong number " +sum);
    }else {
		System.out.println("not an  Armstrong number " + sum);
	}
    }

	}


