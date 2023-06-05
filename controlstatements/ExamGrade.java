package com.controlstatements;

/**
 * Grading System of the students According to their marks
 * 
 * @author hemanth eaddala
 * @since 31/05/2023
 * @version JDK11
 */
import java.util.Scanner;

public class ExamGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if (marks > 90) {
			System.out.println("O");
		} else if (marks >= 81 && marks <= 90) {
			System.out.println("A");
		} else if (marks >= 71 && marks <= 80) {
			System.out.println("B");
		} else if (marks >= 61 && marks <= 70) {
			System.out.println("C");
		} else if (marks >= 50 && marks <= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
