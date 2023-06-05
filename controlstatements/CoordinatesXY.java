package com.controlstatements;

/**
 * Identifying the quadrant according to the user values
 * @author hemanth eaddala 
 * @01/06/2023
 * @version JDK11
 */
import java.util.Scanner;

public class CoordinatesXY {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the x value : ");
		int x = value.nextInt();
		System.out.println("Enter the y value : ");
		int y = value.nextInt();
		if (x > 0 && y > 0) {
			System.out.println("It is first quadrant : (" + x + "," + y + ")");
		} else if (x < 0 && y > 0) {
			System.out.println("It is second quadrant : (" + x + "," + y + ")");
		} else if (x < 0 && y < 0) {
			System.out.println("It is third quadrant : (" + x + "," + y + ")");
		} else if (x > 0 && y < 0) {
			System.out.println("It is fourth quadrant : (" + x + "," + y + ")");
		} else if (x > 0 && y == 0) {
			System.out.println("It is 'x' positive : (" + x + "," + y + ")");
		} else if (x < 0 && y == 0) {
			System.out.println("It is 'x' negative : (" + x + "," + y + ")");
		} else if (x == 0 && y > 0) {
			System.out.println("It is 'y' positive : (" + x + "," + y + ")");
		} else if (x == 0 && y < 0) {
			System.out.println("It is 'y' negative : (" + x + "," + y + ")");
		} else {
			System.out.println("It is a origin : (" + x + "," + y + ")");
		}
		value.close();
	}
}
