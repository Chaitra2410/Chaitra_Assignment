package com.cg.stringbuffer;

public class AppendString {
	public static void main(String[] args) {
		
	StringBuffer s = new StringBuffer();
	String s1="StringBuffer", s2=" is a peer class of String ", s3="that provides much of ",s4="functionality of Strings";
	s.append(s1).append(s2).append(s3).append(s4);
	System.out.println(s);
	}
}
