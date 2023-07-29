package com.rays.basics;

public class Palindrome {

	public static void main(String[] args) {
	int number = 371;
	int sum = 0;
	int r;
	int n = number;
	while (n>0) {
		r = n%10;
		sum = (sum*10)+r	;
		n = n/10;
	}
	if(sum==number){
		System.out.println(" Yes palindrome"+sum);
	}else {
		System.out.println("Not palindrome"+ sum);
	}
		
	}
	}


	

	


