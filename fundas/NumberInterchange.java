package com.fundas;
/**
 * Interchanging the numbers 
 * @author hemanth eaddala
 * @since 30/05/2023
 * @version JDK11
 */
public class NumberInterchange {
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;
		int number3 = 30;
		int number4 = 1000;
		System.out.println(number1 + " " + number2 + " " + number3 + " " + number4);
//	d.100 to number1
		number4 = number3;
//	b. number2's value to number3
		number3 = number2;
//	c. number3's value to number4
		number2 = number1;
//  a. number1 value is 100
		number1 = 100;
		System.out.println(number1 + " " + number2 + " " + number3 + " " + number4);
	}
}
