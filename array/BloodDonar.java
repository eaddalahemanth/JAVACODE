package com.array;
/**
 * Identifying Blood donar is eligible for donating the blood
 * @author hemanth eaddala 
 * @02/06/2023
 * @version JDK11
 */
import java.util.Scanner;

public class BloodDonar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int weight = sc.nextInt();
		eligibilityCheck(age, weight);
	}

	public static void eligibilityCheck(int age, int weight) {
		if (weight > 45) {
			if (age > 18 && age < 55) {
				System.out.println("You are eligible for donating Blood");
			} else {
				System.out.println("you are not eligible for donating Blood");
			}
		}
	}
}
