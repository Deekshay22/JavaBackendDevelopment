package com.Cons;

public class Main {
	public static void main(String[] args) {

		int x = 10;// local variable -- No Default Values

		/* local variable has no default values */
		
		Bank bank = new Bank();
		// default value
		bank.print();

	}
}

/*
 * Integer-- 0 String --> null(Nothing) floating -->0.0 Boolean -->false
 */

class Bank {
	String name;// information/data/prorpertis --> instance variable
	String address;
	long id;
	

	public Bank() {
		this("PNB");
		System.out.println("First constructor");
	}
	

	public Bank(String name) {
		this(name, "unknown", 0); //constructor chaining
		System.out.println("second constructor");
		
	}


	public Bank(String name, String address, long id) {
		super();
		this.name = name;
		this.address = address;
		this.id = id;
		System.out.println("I'm in third constructor");
	}

	void chequeSubmit() {
		System.out.println("submit check");
	}

	void print() {
		System.out.println("id " + id + " name " + name + " address " + address);
	}
}