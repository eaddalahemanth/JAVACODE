package com.assignment2;
/**
 * checking the values with the two operators 
 * @author hemanth eaddala
 * @since 30/05/2023
 * @version JDK11
 */
public class Conditions {
	public static void main(String[] args) {
		int a = 55;
		int b = 70;
		System.out.println(a < 50 && a < b);
		a = 60;
		b = 100;
		System.out.println(a < 50 || a < b);
	}
}
