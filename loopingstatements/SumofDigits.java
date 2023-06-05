package com.loopingstatements;

import java.util.Scanner;

public class SumofDigits {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		int num = value.nextInt();
		int sum = 0;
		while (num > 0) {
			int last = num % 10;
			sum = sum + last;
			num = num / 10;
		}
		System.out.println("Sum of given value is : " + sum);
	}

}
