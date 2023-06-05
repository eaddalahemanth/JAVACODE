package com.abstraction;

interface Shape1 {

	double getArea();

	double getPerimeter();
}

class Circle1 implements Shape1 {
	float radius;

	public Circle1(float radius) {
		super();
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	@Override
	public double getArea() {
		return (Math.PI * getRadius() * getRadius());
	}

	@Override
	public double getPerimeter() {
		return (2 * Math.PI * getRadius());
	}
}

class Rectangle implements Shape1 {
	float radius;

	public Rectangle(float radius) {
		super();
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	@Override
	public double getArea() {
		return (getRadius() * getRadius());
	}

	@Override
	public double getPerimeter() {
		return (2 * (getRadius() + getRadius()));
	}
}

public class Interface {
	public static void main(String[] args) {
		Shape1 s1 = new Circle1(22.4f);
		System.out.println("Area of circle : ");
		System.out.println(s1.getArea());
		System.out.println("Perimeter of circle : ");
		System.out.println(s1.getPerimeter());
		Shape1 s2 = new Circle1(22.4f);
		System.out.print("Area of rectangle : ");
		System.out.println(s2.getArea());
		System.out.print("Perimeter of rectangle : ");
		System.out.println(s2.getPerimeter());
	}
}
