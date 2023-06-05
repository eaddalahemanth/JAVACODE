package com.controlstatements;

/**
 * Finding the car number which is lucky and which is not lucky by using given variable
 * 
 * @author hemanth eaddala
 * @since 31/05/2023
 * @version JDK11
 */
import java.util.Scanner;

public class Luckynumber {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the car number : ");
		int carNum = value.nextInt();
		if (carNum >= 1000 && 10000 > carNum) {
			int sum = (((carNum) % 10) + (((carNum) / 10) % 10) + (((carNum) / 100) % 10) + (((carNum) / 1000) % 10));
			if (sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
				System.out.println("Lucky Number ");
			} else {
				System.out.println("Sorry it’s not my lucky number  ");
			}
		}
	}
}
