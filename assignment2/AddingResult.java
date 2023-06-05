package com.assignment2;

import java.util.Scanner;

/**
 * Calculating the values taken by the user
 * 
 * @author hemanth eaddala
 * @since 30/05/2023
 * @version JDK11
 */
public class AddingResult {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		int number = value.nextInt();
		System.out.println((((number + 8) / 3) % 5) * 5);
		value.close();
	}
}
