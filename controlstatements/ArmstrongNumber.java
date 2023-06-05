package com.controlstatements;

/**
 * Identifying the Armstrong number by using control statements
 * 
 * @author hemanth eaddala
 * @since 31/05/2023
 * @version JDK11
 */
import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int l1 = (num % 10);
		int l2 = (num / 10) % 10;
		int l3 = (num / 100) % 10;
		int num1 = ((l1 * l1 * l1) + (l2 * l2 * l2) + (l3 * l3 * l3));
		if (num == num1) {
			System.out.println("It is Armstrong number " + num1);
		} else {
			System.out.println("It is not a Armstrong number " + num1);
		}
	}
}
