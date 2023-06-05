package com.controlstatements;

import java.util.Scanner;

/**
 * Checking the user enter number is positive or negative
 * 
 * @author hemanth eaddala
 * @since 31/05/2023
 * @version JDK11
 */
public class PositiveNegitive {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = value.nextInt();
		if (num != 0) {
			if (num > 0) {
				System.out.println("Given number is Positive : " + num);
			} else {
				System.out.println("Given number is Negative : " + num);
			}
		} else {
			System.out.println("Given number is neither positive nor negitive: " + num);
		}
	}
}
