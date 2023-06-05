package com.assignment2;

/**
 * Identifying and sum of the bulbs with led and cfl
 * @author hemanth eaddala
 * @since 30/05/2023
 * @version JDK11
 */
import java.util.Scanner;

public class Bulbs {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		int led = value.nextInt();
		int cfl = value.nextInt();
		System.out.println(led + cfl);
	}
}
