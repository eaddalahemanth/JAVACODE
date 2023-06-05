package com.assignment2;

import java.util.Scanner;

/**
 * Printing the last two digits of a number given by the user
 * 
 * @author hemanth eaddala
 * @since 30/05/2023
 * @version JDK11
 */
public class Last2Digits {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		int number = value.nextInt();
		System.out.println(number % 100);
	}
}
