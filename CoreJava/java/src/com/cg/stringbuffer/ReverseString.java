package com.cg.stringbuffer;

public class ReverseString {

	public static void main(String[] args) {
	StringBuffer s= new StringBuffer();
	String s1="The method returns the reversed object on which it was called";
	s.append(s1).reverse();
	System.out.println(s);
	}

}
