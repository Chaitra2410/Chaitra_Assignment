package com.cg.datastructure;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int t = sc.nextInt();
		int r = sc.nextInt();
		int Si = p * t * r / 100;
		System.out.println(Si);

	}
//compound intrest
}