package com.loopingstatements;

import java.util.Scanner;

public class Divisibleof2and4 {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		int num = value.nextInt();
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0 && i % 4 == 0 ) {
				System.out.print(i + ", ");
			}
		}
	}
}
