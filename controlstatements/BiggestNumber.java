package com.controlstatements;

import java.util.Scanner;

/**
 * Requirement to test two numbers for greater with conditional statements
 * 
 * @author hemanth eaddala
 * @since 31/05/2023
 * @version JDK11
 */
public class BiggestNumber {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.print("Enter the a value : ");
		int a = value.nextInt();
		System.out.print("Enter the b value : ");
		int b = value.nextInt();
		if ((a > 0 && b > 0) && a != b) {
			if (a > b) {
				System.out.println("a is bigger : " + a);
			} else {
				System.out.println("b is bigger : " + b);
			}
		} else {
			System.out.println("please enter the values greater than Zero and both numbers not be same");
		}
		value.close();
	}
}
