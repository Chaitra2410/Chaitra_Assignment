package com.cg.stringbuilder;

public class ReverseString {
public static void main(String[] args) {
	StringBuilder s= new StringBuilder();
	String s1="The method returns the reversed object on which it was called";
	s.append(s1).reverse();
	System.out.println(s);
}
}
