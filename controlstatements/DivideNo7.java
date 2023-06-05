package com.controlstatements;

/**
 * printing the number if it divisible with 7 or not
 * @author hemanth eaddala 
 * @01/06/2023
 * @version JDK11
 */
import java.util.Scanner;

public class DivideNo7 {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		int num = value.nextInt();
		if (num > 0) {
			if (num % 7 == 0) {
				System.out.println("Number is divisible with 7 : " + num);
			} else {
				System.out.println("Number is not divisible with 7");
			}
		} else {
			System.out.println("Please enter the positive intigers ");
		}
	}
}
