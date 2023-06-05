package com.controlstatements;

/**
 * Identifying the cricket matches according to the particular date
 * @author hemanth eaddala 
 * @01/06/2023
 * @version JDK11
 */
import java.util.Scanner;

public class Iplmatch {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		String date = value.next();
		switch (date) {
		case "12/05/2023":
			System.out.println("This day match is CSK vs GT ");
			break;
		case "13/05/2023":
			System.out.println("This day match is DC vs LSG ");
			break;
		case "14/05/2023":
			System.out.println("This day match is RCB vs SRH ");
			break;
		case "15/05/2023":
			System.out.println("This day match is GT vs RR ");
			break;
		case "16/05/2023":
			System.out.println("This day match is KKR vs PK ");
			break;
		case "17/05/2023":
			System.out.println("This day match is RCB vs CSK ");
			break;
		default:
			System.out.println("selected date is no match");
			break;
		}
		value.close();
	}
}
