package com.classobjectencapsulation;

/**
 * Employee class with identified attributes and methods
 * 
 * @author hemanth eaddala
 * @since 06/02/2023
 * @version JDK11
 */
class Employee5 {
	String empId;
	String empName;
	String emailId;
	long phoneNo;
	double sal;

	public Employee5() {
		empId = "ES5951";
		empName = "EaddalaHemanth";
		emailId = "hemanth.eaddala@expleogroup.com";
		phoneNo = 6309800359l;
		sal = 900000;
	}

	public Employee5(String empId, String empName, String emailId) {
		this.empId = empId;
		this.empName = empName;
		this.emailId = emailId;
	}

	public Employee5(String empId, String empName, String emailId, long phoneNo, double sal) {
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

public class EmployeeConstructor {
	public static void main(String[] args) {
//		object for default cunstructor
		Employee5 em = new Employee5();
		em.getEmployeeDetailsUser();
//		object for parameterised with -3 
		Employee5 em1 = new Employee5("ES5951", "Hemanth", "hemanthreddy2708@gmail.com");
		em1.getEmployeeDetailsUser();
//		object for parameterised with -all 
		Employee5 em2 = new Employee5("ES5951", "Hemanth", "hemanthreddy2708@gmail.com", 6309800359l, 658234);
		em2.getEmployeeDetailsUser();
	}
}
