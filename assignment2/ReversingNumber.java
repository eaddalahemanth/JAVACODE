package com.assignment2;

import java.util.Scanner;

/**
 * reversing the number which is given by the user
 * 
 * @author hemanth eaddala
 * @since 30/05/2023
 * @version JDK11
 */
public class ReversingNumber {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		int number = value.nextInt();
		System.out.println((number % 10) + "" + ((number / 10) % 10) + ((number / 100) % 10));
	}
}
