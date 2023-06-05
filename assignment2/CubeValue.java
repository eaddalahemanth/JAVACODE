package com.assignment2;

import java.util.Scanner;

/**
 * Identifying the cube value of a given number
 * 
 * @author hemanth eaddala
 * @since 30/05/2023
 * @version JDK11
 */
public class CubeValue {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		int number = value.nextInt();
		int cube = number * number * number;
		System.out.println(cube);
	}
}
