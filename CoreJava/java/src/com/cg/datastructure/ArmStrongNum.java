package com.cg.datastructure;

import java.util.Scanner;

public class ArmStrongNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int total=0,t=n;
		
		do {
			int d=n%10;  //rem
			total=d*d*d+total;
			n=n/10;
		}
		while(n!=0);
		if(t==total)
			System.out.println("Armstrong number");
		else
		System.out.println("Not an Armstrong number");
	
	}

}
