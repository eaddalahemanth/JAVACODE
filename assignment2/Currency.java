package com.assignment2;

import java.util.Scanner;

/**
 * @division of currency by the 10,50 and 100rs notes
 * @author hemanth eaddala
 * @since 30/05/2023
 * @version JDK11
 */
public class Currency {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		int number = value.nextInt();
		int ten = 10;
		int fifty = 50;
		int hundred = 100;
		System.out.println("number of 100 notes: " + (number / hundred) + "\nnumber of 50 notes : "
				+ (number % hundred) / fifty + "\nnumber of 10 notes : " + (number % 50) / ten);
	}
}
