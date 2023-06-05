package com.assignment2;

/**
 * Swaping the numbers in 3 different types
 * 
 * @author hemanth eaddala
 * @since 30/05/2023
 * @version JDK11S
 */
public class Swapping {
	public static void main(String[] args) {
		int number1 = 6;
		int number2 = 8;
		System.out.println(number1 + " " + number2);
		int temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println(number1 + " " + number2);
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println(number1 + " " + number2);
		number1 = number1 ^ number2;
		number2 = number1 ^ number2;
		number1 = number1 ^ number2;
		System.out.println(number1 + " " + number2);
	}
}
