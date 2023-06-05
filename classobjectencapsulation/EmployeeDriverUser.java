package com.classobjectencapsulation;

import java.util.Scanner;

class EmployeeUser {
	String empId;
	String empName;
	String emailId;
	long phoneNo;
	double sal;

	public void setEmployeeDetailsUser(String empId, String empName, String emailId, long phoneNo, double sal) {
		this.empId = empId;
		this.empName = empName;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.sal = sal;
	}

	public void getEmployeeDetailsUser() {

		System.out.println("Employee Id : " + empId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee email : " + emailId);
		System.out.println("Employee Phone : " + phoneNo);
		System.out.println("Employee Salary : " + sal);
	}
}

public class EmployeeDriverUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String empId = sc.next();
		String empName = sc.next();
		String emailId = sc.next();
		long phoneNo = sc.nextLong();
		double sal = sc.nextDouble();

//			creating object
		EmployeeUser employe = new EmployeeUser();
		employe.setEmployeeDetailsUser(empId, empName, emailId, phoneNo, sal);
		employe.getEmployeeDetailsUser();
		EmployeeUser employe1 = new EmployeeUser();
		employe1.setEmployeeDetailsUser("ES5951", "Hemanth", "hemanthreddy2708@gmail.com", 6309800359l, 2345);
		employe1.getEmployeeDetailsUser();
	}
}
