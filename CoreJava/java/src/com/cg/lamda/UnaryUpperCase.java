package com.cg.lamda;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class UnaryUpperCase {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Aadya");
		a.add("Varun");
		a.add("Chai");
		a.add("Jaanu");
		
		a.replaceAll(new Unary());
		System.out.println(a);

	}

}
class Unary implements UnaryOperator<String>{

	@Override
	public String apply(String t) {
		
		return t.toUpperCase();
	}
	
}
