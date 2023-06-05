package com.assignment2;

import java.util.Scanner;

/**
 * @Finding the intrest based up on principal amount,Intrest Amount and No of
 *          years
 * @author hemanth eaddala
 * @since 30/05/2023
 * @version JDK11
 */
public class IntrestRate {
	public static void main(String[] args) {
		Scanner values = new Scanner(System.in);
		int principalAmount = values.nextInt();
		int intrestRate = values.nextInt();
		int years = values.nextInt();
		System.out.println((principalAmount * intrestRate * years) / 100);
	}
}
