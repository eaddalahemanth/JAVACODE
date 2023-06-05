package com.fundas;

import java.util.Scanner;

/**
 * 
 * printing username by the user and greet the user 
 * @author hemanth eaddala
 * @since 30/05/2023 
 * @version JDK11
 */
public class GreetUser {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);// creating a Scanner class to getting values from user
		System.out.println("Please enter the user name : ");
		String userName = read.next();
		System.out.println("Hello " + userName + " !!!!!");
		read.close();
	}
}
