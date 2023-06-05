package com.assignment2;

import java.util.Scanner;

/**
 * Finding The amount spent in market,Final amount at reach the home and The
 * amount kept in magic machine
 * 
 * @author hemanth eaddala
 * @since 30/05/2023
 * @version JDK11
 */
public class AppleBanana {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		int totalMoney = value.nextInt();
		int anishaSpent = value.nextInt();
		int rajuSpent = value.nextInt();
		System.out.println("The amount spent in market : " + (anishaSpent + rajuSpent));
		System.out.println("Final amount at reach the home : " + ((totalMoney - (anishaSpent + rajuSpent)) * 3));
		System.out.println("The amount kept in magic machine : " + (totalMoney - (anishaSpent + rajuSpent)));
	}
}
