package com.assignment2;

import java.util.Scanner;

/**
 * Identifying the students likes oranges, students likes mangos, total number
 * of students
 * 
 * @author hemanth eaddala
 * @since 30/05/2023
 * @version JDK11
 */
public class MangoOrange {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		int girlsOrange = value.nextInt();
		int girlsMango = value.nextInt();
		int boysOrange = value.nextInt();
		int boysMango = value.nextInt();
		System.out.println("Students like Oranges : " + (girlsOrange + boysOrange));
		System.out.println("Student like Mangos : " + (girlsMango + boysMango));
		System.out.println("Total number of students : " + (girlsOrange + boysOrange + girlsMango + boysMango));
		int totalGirls = (girlsOrange + girlsMango);
		int totalBoys = (boysOrange + boysMango);
		System.out.println(totalGirls > totalBoys);
	}
}
