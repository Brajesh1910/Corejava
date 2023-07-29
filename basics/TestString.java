package com.rays.basics;

public class TestString {
public static void main(String[] args) {
	String name = "Jayesh Mishra";
	System.out.println(name);
	System.out.println("Stringlength="+name.length());
	System.out.println("7th character="+name.charAt(7));
	System.out.println("Mish index="+name.indexOf("Mish"));
	System.out.println("First a position="+ name.indexOf("a"));
	System.out.println("Last r position="+ name.lastIndexOf("r"));
	System.out.println("a is replaced by d ="+name.replace("a","d"));
	System.out.println("chhota jayesh=" +name.toLowerCase());
	System.out.println("Bada jayesh="+name.toUpperCase());
	System.out.println("Start With Jayesh="+name.startsWith("Jayesh"));
	System.out.println("Ends with hra="+name.endsWith("hra"));
	System.out.println("Substring="+name.substring(7));
}

}
