package com.controlstatements;

/**
 * finding the discount according to the customer spends in the shop
 * 
 * @author hemanth eaddala
 * @since 31/05/2023
 * @version JDK11
 */
import java.util.Scanner;

public class ShoppingDiscount {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		if (amount < 1000) {
			System.out.println(" 5% Discount ");
		} else if (amount >= 1000 && amount <= 4999) {
			System.out.println(" 10% Discount ");
		} else if (amount > 5000) {
			System.out.println(" 25% Discount ");
		}
	}
}