package com.rays.basics;

public class TestStringVBuffer {

	public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("vijay");
	sb.append("Dinanath Chouhan");
	System.out.println("length:"+sb.length() );
System.out.println("capcity"+sb.capacity());
System.out.println("charat ="+sb.charAt(7));
System.out.println("IndexOf:"+sb.indexOf("Dinanath"));
System.out.println("Replace:"+sb.replace(1,5, "jay"));
System.out.println("Reverse:"+sb.reverse());
	}
}
