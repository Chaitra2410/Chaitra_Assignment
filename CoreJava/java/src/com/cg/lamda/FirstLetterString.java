package com.cg.lamda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class FirstLetterString {

	public static void main(String[] args) {
		StringBuilder b=new StringBuilder();
		ArrayList<String> a=new ArrayList<String>();
		a.add("varun");
		a.add("arun");
		a.add("tarun");
		a.add("kiran");
//		String s="";
		Consumer<String> u= st->b.append(st.charAt(0));
		
		for (int i = 0; i < a.size(); i++) {
			u.accept(a.get(i));
//			s=s+a.get(i).charAt(0);
	
		}
		System.out.println(b);
	}

}
