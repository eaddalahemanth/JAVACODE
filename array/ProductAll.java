package com.array;

import java.util.Scanner;

public class ProductAll {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num = read.nextInt();
		int[] a = new int[num];
		for (int i = 0; i < a.length; i++) {
			a[i] = read.nextInt();
		}
		int sum = 0;
		for (int b : a) {
			sum = sum + b;
		}
		System.out.println("sum of given elements : " + sum);
		int avg = sum / a.length;
		System.out.println("Average of given elements : " + avg);
		int prod = 1;
		for (int b : a) {
			prod = prod * b;
		}
		System.out.println("Product of numbers : " + prod);

	}
}
