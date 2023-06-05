package com.array;

import java.util.Scanner;

public class Replace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[sc.nextInt()];
		System.out.println("Enter the values : ");
		for (int i = 0; i < a.length; i++) {
			int k=0;
			int j = sc.nextInt();
			if (j < 0) {
				break;
			} else {
				a[i] = j;
				k++;
				int[] b = new int[(a.length - 1)];
				b[i] = j;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a.length > 0) {
				System.out.print(a[i] + " ");
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				a[i] = 0;
			} else if (a[i] % 9 == 0) {
				a[i] = 4;
			} else if ((a[i]) % 10 == 1) {
				a[i] = 3;
			} else if ((a[i]) % 8 == 0) {
				a[i] = 2;
			} else if ((a[i]) % 2 == 1) {
				a[i] = 1;
			} else {
				a[i] = 0;
			}
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			if (a.length > 0) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
// 5 2 8 9 16 27 6 1 18 -12
