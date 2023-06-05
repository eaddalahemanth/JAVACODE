package com.loopingstatements;

import java.util.Scanner;

public class AllOddSum {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		int num = value.nextInt();
		int oddSum = 0;
		int evenSum = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 1) {
				oddSum = oddSum + i;
			} else if (i % 2 == 0) {
				evenSum = evenSum + i;
			}
		}
		System.out.println("Even sum : " + evenSum);
		System.out.println("Odd sum : " + oddSum);
		value.close();
	}
}
