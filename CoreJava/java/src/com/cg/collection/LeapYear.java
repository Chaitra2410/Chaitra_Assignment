package com.cg.collection;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LeapYear {

	static void leapYear(String s) {
		try {
			DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate l = LocalDate.parse(s, d);
			int year = l.getYear();
			if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
				System.out.println(year + " is leap year");
			} else
				System.out.println(year + " is not a leap year");

		} catch (Exception e) {
			System.out.println("enter valid date format");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter date in dd/MM/yyyy");
		String s = sc.next();
		leapYear(s);
	}

}
