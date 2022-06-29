package com.cg.generics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class Pair {

	public static void main(String[] args) {
		Map<String ,String> tm=new TreeMap<String, String>();
		
		tm.put("1", "Amith");
		tm.put("2","Aadya");
		tm.put("3","Jaanu");
		tm.put("4","Varun");
		System.out.println(tm);
		Map<String ,LocalDate> tm1=new TreeMap<String,LocalDate>();
		tm1.put("1",LocalDate.now());
		System.out.println(tm1);

	}

}
