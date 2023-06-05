package com.fundas;

/**
 * Printing the values to check the impact of different datatypes typecasting
 * @author hemanth eaddala
 * @since 30/05/2023
 * @version JDK11
 */
public class ImpactValues {
	public static void main(String[] args) {
		int price = 52;
		System.out.println(price);
		float priceInFloat = price;
		System.out.println(priceInFloat);
		byte age = 83;
		System.out.println(age);
		int intAge = age;
		System.out.println(intAge);
		int highestAge = 120;
		System.out.println(highestAge);
		byte byteAge = (byte) highestAge;
		System.out.println(byteAge);
		highestAge = 130;
		System.out.println(highestAge);
		byteAge = (byte) highestAge;
		System.out.println(byteAge);
	}
}
