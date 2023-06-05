package com.classobjectencapsulation;

/**
 * creating the circle class identifying the area using functions
 * 
 * @author hemanth eaddala
 * @since 3/05/2023
 * @version JDK11
 */
public class Circle {
	private double radius = 1.0;
	private String color = "red";

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

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}

	public double getArea() {
		double area;
		area = (2 * Math.PI * radius);
		System.out.println("the area of circle is : " + area);
		return area;
	}

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public static void main(String[] args) {
		Driver d1 = new Driver();
		d1.exicute();
	}
}

class Driver {

	public void exicute() {
		double radius = 1.0;
		String color = "red";
		Circle c1 = new Circle();
		System.out.println(c1);
		Circle c2 = new Circle(radius);
		System.out.println(c2);
		c2.setRadius(100);
		System.out.println(c2);
		Circle c3 = new Circle(radius, color);
		System.out.println(c3);
		c3.setRadius(10);
		System.out.println(c3);
		c3.getArea();
		System.out.println(c3);

	}
}
