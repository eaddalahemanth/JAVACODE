package com.controlstatements;

/**
 * comparing that area of rectangle is higher or area of perimeter higher 
 * @author hemanth eaddala 
 * @01/06/2023
 * @version JDK11
 */
import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		int length = value.nextInt();
		int breadth = value.nextInt();
		if ((length * breadth) > (2 * (length + breadth))) {
			System.out.println("The area of rectangle is high");
		} else {
			System.out.println("The area of rectangle is Low ");
		}
	}
}
