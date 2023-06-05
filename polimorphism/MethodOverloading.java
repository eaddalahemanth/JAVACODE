package com.polimorphism;

public class MethodOverloading {
	static int add(int a, int b) {
		return a+b;
	}
	static char add(char a, char b) {
		return (char) (a+b);
	}
	static double add(double a, double b) {
		return (a+b);
	}
	static String add(String a,String b)
	{
		return a+b;
	}
	static float add(float a,float b) {
		return (a+b);
	}

	public static void main(String[] args) {
		System.out.println("Adding int numbers : "+add(5,7));
		System.out.println("Adding char variables : "+add('d','e'));
		System.out.println("Adding double numbers : "+add(3.423,7.34));
		System.out.println("Concatinating  String Variables : "+add("Hemanth "," Eaddala"));
		System.out.println("Adding float numbers : "+add(5.3f,7.5f));
	}
}
