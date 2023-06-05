package com.loopingstatements;

import java.util.Scanner;

public class CountingDigits {
	public static void main(String[] args) {
		Scanner values = new Scanner(System.in);
		int num=values.nextInt();
		int num1=num;
		int count=0;
		while(num>0) {
			int last =num%10;
			count++;
			num=num/10;
		}
		System.out.println("Given number : "+num1+" \nNumber of digits : "+count);
	}
}
