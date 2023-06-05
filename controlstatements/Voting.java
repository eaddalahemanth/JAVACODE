package com.controlstatements;
/**
 * checking the person is eligible for voting
 * @author hemanth eaddala 
 * @01/06/2023
 * @version JDK11
 */
import java.util.Scanner;

public class Voting {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = value.nextInt();
		if (age > 0) {
			if (age >= 18) {
				System.out.println("Eligible for vote : " + age);
			} else {
				System.out.println("Not eligible for vote. Wait up to " + (18 - age) + " years");
			}
		} else {
			System.out.println("Enter a valid age!!");
		}
		value.close();
	}
}
