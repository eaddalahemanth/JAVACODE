package com.inheritance;

class Circle {
	private double radius = 1.0;
	private String color = "red";

	public Circle() {
		this.radius = radius;
		this.color = color;
	}

	public Circle(double radius) {
		this.radius = radius;
		this.color = color;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		return (2 * Math.PI * radius);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
}

class Cylinder extends Circle {
	private double height=1.0;

	public Cylinder() {
		super();
	}

	public Cylinder(double radius) {
		super(radius);
	}

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	public Cylinder(double radius, double height, String color) {
		super(radius, color);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume() {
		System.out.println("Volume of the circle : ");
		return getArea() * height;
	}

	@Override
	public String toString() {
		
		System.out.println(super.toString());
		return "Cylinder [height=" + height + "]";
	}

}

public class CircleCylinder {
	public static void main(String[] args) {
		Cylinder c1 = new Cylinder();
		Cylinder c2 = new Cylinder(10);
		Cylinder c3 = new Cylinder(10, 20);
		Cylinder c4 = new Cylinder(10, 20, "blue");
		System.out.println(c1 + "\n" + c2 + "\n" + c3 + "\n" + c4);

		System.out.println("area of the circle :\n " + c4.getArea());
		System.out.println(c4.getVolume());
	}
}
