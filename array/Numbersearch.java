package com.array;

import java.util.Scanner;

public class Numbersearch {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a[] = new int[read.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i] = read.nextInt();
		}
		int identify = read.nextInt();
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==identify)
			{
				count++;
			}
		}
		System.out.println("Total number of "+identify+" is : "+count);
	}
}
