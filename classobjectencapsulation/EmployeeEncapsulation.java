package com.classobjectencapsulation;

class EmployeeEncap {
	private String empId;
	private String empName;
	private String emailId;
	private long phoneNo;
	private double sal;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public EmployeeEncap(String empId, String empName, String emailId) {
		this.empId = empId;
		this.empName = empName;
		this.emailId = emailId;
	}

	public EmployeeEncap(String empId, String empName, String emailId, long phoneNo, double sal) {
		this.empId = empId;
		this.empName = empName;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.sal = sal;
	}
}

public class EmployeeEncapsulation {
	public static void main(String[] args) {
		EmployeeEncap enc = new EmployeeEncap("ES5951", "Hemanth", "hemanthreddy2708@gmail.com", 6309800359l, 658234);
		System.out.println(enc.getEmpId());
		System.out.println(enc.getEmpName());
		System.out.println(enc.getEmailId());
		System.out.println(enc.getPhoneNo());
		System.out.println(enc.getSal());
	}
}
