package com.array;

import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int currentSalary = sc.nextInt();
		float hikePercentage = sc.nextInt();
		float f = calculateSalary(currentSalary, hikePercentage);
		System.out.println("Final salary : " + f);

	}

	public static float calculateSalary(int currentSalary, float hikePercentage) {
		float finalSalary = (currentSalary + (currentSalary) * (hikePercentage / 100));
		return finalSalary;
	}
}
