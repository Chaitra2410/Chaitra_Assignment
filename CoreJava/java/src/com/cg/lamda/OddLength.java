package com.cg.lamda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class OddLength {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Varun");//true
		a.add("Jaanu");
		a.add("Chai");
		a.add("Sanvi");
		

			
		Predicate<String> length = l -> l.length() % 2 != 0;
		a.removeIf(length);

		System.out.println(a);
		
		
		
	}

}
