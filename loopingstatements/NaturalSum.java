package com.loopingstatements;

import java.util.Scanner;

public class NaturalSum {
public static void main(String[] args) {
	Scanner value=new Scanner(System.in);
	int num=value.nextInt();
	int sum=0;
	for(int i=1;i<=num;i++)
	{
		sum=sum+i;
	}
	System.out.println("Total sum of natural number is : "+sum);
}
}
