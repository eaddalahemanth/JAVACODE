package com.controlstatements;

/**
 * if an integer variable currentNumber is odd,
 * change its value so that it is now 3 times currentNumber plus 1,
 * otherwise change its value so that it is now half of currentNumber.
 * @author hemanth eaddala 
 * @01/06/2023
 * @version JDK11
 */
import java.util.Scanner;

public class CurrentNumber {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		int currentNumber = value.nextInt();
		if (currentNumber % 2 == 1) {
			System.out.println((currentNumber * 3) + 1);
		} else {
			System.out.println((currentNumber / 2));
		}
	}
}