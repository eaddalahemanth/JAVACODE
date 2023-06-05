package com.classobjectencapsulation;

import java.util.Scanner;

public class InvoiceItem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		String desc = sc.next();
		int qty = sc.nextInt();
		double unitPrice = sc.nextDouble();

		InvoiceItem in = new InvoiceItem(id, desc, qty, unitPrice);
		System.out.println(in);
		System.out.println("Total  Price : " + in.getTotal());
		InvoiceItem in1 = new InvoiceItem(id, desc, qty, unitPrice);
		qty = sc.nextInt();
		unitPrice = sc.nextDouble();
		in1.setQty(qty);
		in1.getQty();
		in1.setUnitPrice(unitPrice);
		in1.getUnitPrice();
		System.out.println(in1);
		System.out.println("Total  Price : " + in1.getTotal());

	}

	private String id;
	private String desc;
	private int qty;
	private double unitPrice;

	public InvoiceItem(String id, String desc, int qty, double unitPrice) {
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "InvoiceItem [id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
	}

	public String getID() {
		return id;
	}

	public String getDesc() {
		return desc;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getTotal() {
		return (unitPrice * qty);
	}
}
