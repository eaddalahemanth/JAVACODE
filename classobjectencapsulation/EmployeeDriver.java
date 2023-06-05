package com.classobjectencapsulation;

/**
 * Employee Driver class to test the methods of employee class
 * 
 * @author hemanth eaddala
 * @since 06/02/2023
 * @version JDK11
 */
class Employee {
	String empId;
	String empName;
	String emailId;
	long phoneNo;
	double sal;

	public void setEmployeeDetails() {
		empId = "ES5951";
		empName = "EaddalaHemanth";
		emailId = "hemanth.eaddala@expleogroup.com";
		phoneNo = 6309800359l;
		sal = 900000;
	}

	public void getEmployeeDetails() {

		System.out.println("Employee Id : " + empId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee email : " + emailId);
		System.out.println("Employee Phone : " + phoneNo);
		System.out.println("Employee Salary : " + sal);
	}
}

public class EmployeeDriver {
	public static void main(String[] args) {
//		creating object
		Employee employee = new Employee();
		employee.setEmployeeDetails();
		employee.getEmployeeDetails();
	}
}
