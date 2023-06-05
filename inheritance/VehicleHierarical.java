package com.inheritance;

class Vehicle {
	private String make;
	private String model;
	private int year;

	public Vehicle(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", year=" + year + "]";
	}
}

class Car extends Vehicle {
	private int numDoors;

	public Car(String make, String model, int year, int numDoors) {
		super(make, model, year);
		this.numDoors = numDoors;
	}

	public int getNumDoors() {
		return numDoors;
	}

	public String startEngine() {
		return "Engine Started";
	}

}

class MotorCycle extends Vehicle {
	private boolean isDoorsThere;

	public MotorCycle(String make, String model, int year, boolean isDoorsThere) {
		super(make, model, year);
		this.isDoorsThere = isDoorsThere;
	}

	public String startEngine() {
		return "Engine Started";
	}

	public boolean isDoorsThere() {
		return isDoorsThere;
	}

}

public class VehicleHierarical {
	public static void main(String[] args) {
		Car c1 = new Car("India", "Toyota", 2023, 5);
		System.out.println(c1);
		System.out.println(c1.startEngine());
		System.out.println(c1.getNumDoors());
		MotorCycle mc1 = new MotorCycle("India", "Bullet", 2023, false);
		System.out.println(mc1);
		System.out.println(c1.startEngine());
		System.out.println();
	}
}
