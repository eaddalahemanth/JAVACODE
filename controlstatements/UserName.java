package com.controlstatements;

/**
 *Comparing the user given data with existing data
 * @author hemanth eaddala 
 * @01/06/2023
 * @version JDK11
 */
import java.util.Scanner;

public class UserName {
	public static void main(String[] args) {

		Scanner value = new Scanner(System.in);
		System.out.print("Enter the valid username : ");
		String username = value.next();
		System.out.print("Enter the valid password : ");
		String password = value.next();
		String un = "Hemanth";
		String ps = "123";
		if ((un.equals(username)) && (ps.equals(password))) {
			System.out.println("Welcome " + username);
		} else {
			System.out.println("Invalid Credentials/Username or Password");
		}
		value.close();
	}
}
