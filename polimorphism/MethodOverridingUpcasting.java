package com.polimorphism;

class Vehicle {
	public void run() {
		System.out.println("Printing the vehicle run method");
	}
}

class Truck extends Vehicle {
	public void run() {
		System.out.println("Printing the Truck run method");
	}
}

class Bike extends Vehicle {
	public void run() {
		System.out.println("Printing the Bike run method");
	}
}

public class MethodOverridingUpcasting {
	public static void main(String[] args) {
		Vehicle v1;
		v1 = new Truck();
		v1.run();
		v1 = new Bike();
		v1.run();
	}
}
