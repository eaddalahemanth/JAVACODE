package com.loopingstatements;

import java.util.Scanner;

public class OddNumbers {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		int count =value.nextInt();
		for (int i = 1; i <= count; i++) {
			if (i % 2 == 1) {
				System.out.print(i + ", ");
			}
		}
	}
}
