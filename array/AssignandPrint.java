package com.array;

/**
 * Assigning and printing the array values and printing the even numbers in array
 * 
 * @author hemanth eaddala @01/06/2023
 * @version JDK11
 */
public class AssignandPrint {
	public static void main(String[] args) {
		int[] a = { 12, 324, 45, 65, 78 };
		System.out.println("Array elements");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
			}
		}

	}
}
