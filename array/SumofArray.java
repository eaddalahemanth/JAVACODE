package com.array;

public class SumofArray {
	public static void main(String[] args) {
		int sum = 0;
		int[] a = { 2, 4, 3, 34, 345, 766, 67, 9, 7, 6, 56 };
		for (int b : a) {
			sum = sum + b;
		}
		System.out.println("Sum is :" + sum);
		int avg = (sum) / a.length;
		System.out.println("average is : " + avg);
		for (int c : a) {
			if (c > avg) {
				System.out.print(c + " ");
			}
		}
	}
}
