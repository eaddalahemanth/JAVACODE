package com.fundas;
import java.util.Scanner;
/**
 * @Booking the Movie ticket by providing the customer details
 * @author hemanth eaddala
 * @since 30/05/2023
 * @version JDK11
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("Enter Movie Id :");
		Scanner sc = new Scanner(System.in);
		int movieId = sc.nextInt();
		System.out.println("Enter Movie Name :");
		String movieName = sc.next();
		System.out.println("Enter Movie Description :");
		String movieDescription = sc.next();
		System.out.println("Enter Movie Language :");
		String movieLanguage = sc.next();
		System.out.println("Enter Movie genre :");
		String movieGenre = sc.next();
		System.out.println("Enter Movie relese date(dd/mm/yy) :");
		String movieReleseDate = sc.next();
		System.out.println("Enter Movie Seat cost :");
		float movieSeatCost = sc.nextFloat();
		System.out.println("Enter Your gender :");
		char Gender = sc.next().charAt(0);
		System.out.println("Movie ID :" + movieId);
		System.out.println("Movie Name : " + movieName);
		System.out.println("Movie Description : " + movieDescription);
		System.out.println("Movie Language : " + movieLanguage);
		System.out.println("Movie genre :" + movieGenre);
		System.out.println("Movie relese date : " + movieReleseDate);
		System.out.println("Movie seat cost : " + movieSeatCost);
		System.out.println("Gender(M/F) : " + Gender);
	}
}
