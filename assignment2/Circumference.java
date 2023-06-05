package com.assignment2;

import java.util.Scanner;

/**
 * @finding the circumference of a circle
 * @author hemanth eaddala
 * @since 30/05/2023
 * @version JDK11
 */
public class Circumference {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		int diameter = value.nextInt();
		System.out.println(Math.round(diameter * 3.14));
		value.close();
	}
}
