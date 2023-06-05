package com.array;

/**
 *identifying count of positive, negative ,even, odd and Zeros numbers
 * @author hemanth eaddala 
 * @02/06/2023
 * @version JDK11
 */
import java.util.Scanner;

public class AllTypeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[20];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int positive = 0;
		int negative = 0;
		int even = 0;
		int odd = 0;
		int zero = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				positive++;
			} else if (a[i] < 0) {
				negative++;
			} else if (a[i] % 2 == 1) {
				odd++;
			} else if (a[i] % 2 == 0) {
				even++;
			} else {
				zero++;
			}
		}
		System.out.println("Count of positive numbers :" + positive);
		System.out.println("Count of negtive numbers :" + negative);
		System.out.println("Count of odd numbers :" + odd);
		System.out.println("Count of even numbers :" + even);
		System.out.println("Count of zero numbers :" + zero);
	}
}