package com.rays.basics;

public class TestStringTotal {
public static void main(String[] args) {
	String[] name = {"brajesh", "jayesh" ,"ram", "sita", "gita"};
	int count = 0;
	for (int i = 0; i < name.length; i++) {
		for (int j = 0; j < name[i].length(); j++) {
			
		if (name[i].charAt(j)== 's') {
			
			count++;
		}
		}
	}
	System.out.println("count ="  + count );
	
}
}
