package com.loopingstatements;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner value=new Scanner(System.in);
		int num=value.nextInt();
		int num1=num;
		int rev=0;
		while(num>0)
		{
			int last=num%10;
			rev=rev*10+last;
			num=num/10;
		}
		while(rev>0)
		{
			int last=rev%10;
			System.out.println(last+" ");
			rev=rev/10;
		}
	}
}
