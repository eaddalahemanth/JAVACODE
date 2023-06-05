package com.classobjectencapsulation;

import java.util.Scanner;

public class Account {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id : ");
		String id = sc.next();
		System.out.println("Enter name : ");
		String name = sc.next();
		System.out.println("Enter balance : ");
		int balance = sc.nextInt();

		Account acc = new Account(id, name);
		Account acc1 = new Account(id, name, balance);
		System.out.println(acc1);
		Account second = new Account(id, name, balance);

		while (true) {
			System.out.println();
			System.out.println("1 . click 1 to credit ");
			System.out.println("2 . click 2 to debit ");
			System.out.println("3 . click 3 to tranfer ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("Enter the amount : ");
				acc1.credit(sc.nextInt());
				System.out.print(acc1);
				break;
			case 2:
				System.out.println("Enter the amount : ");
				acc1.debit(sc.nextInt());
				System.out.print(acc1);
				break;
			case 3:
				System.out.println("Enter the amount : ");
				acc1.transferTo(second, sc.nextInt());
				System.out.print(second);
				break;
			}
		}

	}

	private String id;
	private String name;
	private int balance = 0;

	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public int credit(int amount) {
		return (balance = amount + balance);
	}

	public int debit(int amount) {
		if (amount <= balance) {
			System.out.println("Successfully debited !!");
			return (balance = amount - balance);
		} else {
			System.out.println("Withdraw failed !!");
			return balance;
		}
	}

	public int transferTo(Account second, int amount) {
		if (balance >= amount) {
			System.out.println("Tanasaction succesfull !!");
			return (balance = amount + balance);
		} else {
			System.out.println("Tanasaction failed !!");
			return balance;
		}
	}

}
