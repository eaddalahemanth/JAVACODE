package com.array;

/**
 * Identifying the user data to check he is eligible for voting or not using another class
 * @author hemanth eaddala 
 * @01/06/2023
 * @version JDK11
 */
import java.util.Scanner;

class AgeChecking {
	public static boolean isEligible(int age) {
		if (age >= 18) {
			return true;
		} else {
			return false;
		}
	}
}

public class Voting {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int age = read.nextInt();
		boolean check = AgeChecking.isEligible(age);
		if (check) {
			System.out.println("You are eligible for voting");
		} else {
			System.out.println("You are not eligible for voting");
		}
		read.close();
	}
}
