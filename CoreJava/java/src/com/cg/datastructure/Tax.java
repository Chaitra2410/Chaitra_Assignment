package com.cg.datastructure;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		long ctc = sc.nextLong();
//		if (ctc >= 0 && ctc <= 180000)
//			System.out.println("nil");
//		else if (ctc >= 180001 && ctc <= 300000)
//			System.out.println(ctc * 0.1);
//		else if (ctc >= 300001 && ctc <= 500000)
//			System.out.println(ctc * 0.2);
//		else if (ctc >= 500001 && ctc <= 1000000)
//			System.out.println(ctc * 0.3);
		
		Scanner sc = new Scanner(System.in);
		long ctc = sc.nextLong();
		if (ctc >= 0 && ctc <= 180000)
			System.out.println("No tax required");
		else if (ctc >= 180001 && ctc <= 300000)
			System.out.println("payable tax is 10% of ctc, tax amt= " +ctc*0.1);
		else if (ctc >= 300001 && ctc <= 500000)
			System.out.println("payable tax is 20% of ctc, tax amt= " + ctc*0.2);
		else if (ctc >= 500001 && ctc <= 1000000)
			System.out.println("payable tax is 30% of ctc, tax amt= " + ctc*0.3);
			
	}

}