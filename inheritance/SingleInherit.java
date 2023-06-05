package com.inheritance;

class employee {
	int empId;
	String empName;

	public void setData(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public void getData() {
		System.out.println("Employee Id : " + empId + "\nEmployee Name : " + empName);
	}
}

class Manager extends employee {
	String empDept;

	public void setDept(String empDept) {
		this.empDept = empDept;
	}

	public void getDept() {
		System.out.println("Employee Department : " + empDept);
	}
}

public class SingleInherit {
	public static void main(String[] args) {

		Manager man = new Manager();
		man.setData(10435, "Hemanth");
		man.setDept("QA");
		man.getData();
		man.getDept();
	}
}
