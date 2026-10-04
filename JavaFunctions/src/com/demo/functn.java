package com.demo;

public class functn {
	static String name= "Aditya dhar"; // global variable
public static void main(String[] args) {
	
	int x=9;// local variable means exist only inside this main method curl bracket
	fun1();
	System.out.println("complete all calls");
	
	System.out.println(name);
}
static void fun1() {
	fun2();
	System.out.println("Check fun1 complete");
}
static void fun2() {
	fun3();
	System.out.println("Check fun2 complete");
}
static void fun3() {
	System.out.println("Check fun3 complete");
}
}


