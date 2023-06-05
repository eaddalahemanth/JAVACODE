package com.controlstatements;

/**
 * Identifying the person is a Group Member or Group Leader
 * 
 * @author hemanth eaddala
 * @since 31/05/2023
 * @version JDK11
 */
import java.util.Scanner;

public class GroupLeader {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num % 10 == 0) {
			System.out.println("Group Leader");
		} else {
			System.out.println("Group Member");
		}
	}
}
