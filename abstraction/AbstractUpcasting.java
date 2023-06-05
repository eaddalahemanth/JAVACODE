package com.abstraction;

abstract class Shape {
	private int radius, length, breadth;

	public Shape(int radius) {
		this.radius = radius;
	}

	public Shape(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public int getRadius() {
		return radius;
	}

	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}

	public abstract double area();

	public abstract double perimeter();
}

class Circle extends Shape {

	public Circle(int radius) {
		super(radius);
	}

	@Override
	public double area() {
		super.getRadius();
		return (Math.PI * getRadius() * getRadius());
	}

	@Override
	public double perimeter() {
		super.getRadius();
		return (2 * Math.PI * getRadius());
	}

}

class Square extends Shape {

	public Square(int length, int breadth) {
		super(length, breadth);
	}

	@Override
	public double area() {
		super.getRadius();
		return (getLength() * getBreadth());
	}

	@Override
	public double perimeter() {
		super.getRadius();
		return (4 * getLength());
	}

}

public class AbstractUpcasting {
	public static void main(String[] args) {

		Shape s = new Circle(10);
		System.out.print("Area of circle : ");
		System.out.println(s.area());
		System.out.print("perimeter of circle : ");
		System.out.println(s.perimeter());
		s = new Square(10, 10);
		System.out.print("Area of square : ");
		System.out.println(s.area());
		System.out.print("perimeter of square : ");
		System.out.println(s.perimeter());

	}
}
