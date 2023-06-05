package com.array;

/**
 * Giving values to array and reversing the values and store in another array
 * @author hemanth eaddala 
 * @02/06/2023
 * @version JDK11
 */
import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] a = new int[num];
		int[] b = new int[num];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		int k = 0;
		for (int j = a.length - 1; j >= 0; j--) {
			b[k] = a[j];
			k++;
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
