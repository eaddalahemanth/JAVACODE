package com.controlstatements;

import java.util.Scanner;

/**
 * taking the marks from the user and analysing the PASS or FAIL
 * 
 * @author hemanth eaddala @01/06/2023
 * @version JDK11
 */
public class Marks50 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if (marks >= 50) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
	}
}
