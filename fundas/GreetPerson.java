package com.fundas;

import java.util.Scanner;

/**
 * Taking three names from the user and greet them Welcome ram! Welcome hari!! welcome rahul too!!!
 * @author hemanth eaddala
 * @since 30/05/2023
 * @version JDK11
 */
public class GreetPerson {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String name1 = read.next();
		String name2 = read.next();
		String name3 = read.next();
		System.out.println("Welcome " + name1+"Welcome! " + name2 + " Welcome!! " + name3 + " too!!!");
		read.close();
	}
}
