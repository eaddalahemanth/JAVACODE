package com.loopingstatements;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		int num = value.nextInt();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				System.out.print(i + " ");
		}
	}
}
