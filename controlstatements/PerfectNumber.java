package com.controlstatements;

/**
 * Checking that given number is perfect number or not
 * 
 * @author hemanth eaddala
 * @since 31/05/2023
 * @version JDK11
 */
import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (num == sum) {
			System.out.println("It is a perfect number : " + sum);
		} else {
			System.out.println("It is not a Perfect number :" + sum);
		}
	}
}
