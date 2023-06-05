package com.assignment2;

import java.util.Scanner;

/**
 * Finding the perimeter of a rectangle
 * @author hemanth eaddala
 * @since 30/05/2023
 * @version JDK11
 */
public class Perimeter {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		int length = value.nextInt();
		int breadth = value.nextInt();
		int perimeter = (2 * length + 2 * breadth);
		System.out.println(perimeter);
	}
}
