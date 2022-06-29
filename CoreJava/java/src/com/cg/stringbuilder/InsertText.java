package com.cg.stringbuilder;

public class InsertText {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		String s1 = "Insert text", s2 = "it is used to _ at the specified index position";
		s.append(s2).replace(14, 15, s1);
		System.out.println(s);

	}

}
