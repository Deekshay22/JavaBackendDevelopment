package com.demo;

public class Demo {
	
	public static void main(String[] args) {
		//Function in java 
		
		greet();
		String a= "sitaRam";
		String b = " Radhe radhe";
		saySitaRam(a);//argument
		int resultN= getNumber();
		System.out.println(resultN);
		
		System.out.println(getData(a));
		System.out.println(sum(a,b));
	}
	
	static void greet() {
		System.out.println("hello");
	}
	
	//taken parameter
	static  void saySitaRam(String a) {
		System.out.println("Hello"+a); 
	}
	
	static int getNumber() {
		return 10;
	}
	
	static String getData(String name) {
		return name;
	}
	
	static String sum(String a, String b) {
		return (a + b);
	}
}
