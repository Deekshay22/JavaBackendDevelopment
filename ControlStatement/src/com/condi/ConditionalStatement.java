package com.condi;

public class ConditionalStatement {
	public static void main(String[] args) {
		 
		 int a=5;
		 if(a % 2==0) {
			 System.out.println(a);
		 }
		 else {
			 System.out.println("okay");
		 }
		 System.out.println("hello");
		 
		 // Nested if
		 int i =5;
		 
		 if(i>5) {
			 if(i<10) {
				 System.out.println("yes");
			 }else {
				 System.out.println("i is greater than 10");
			 }
		 }
		 else {
			 System.out.println("i need to we check for range");
		 }
		 
		 System.out.println();
		 // if else if ladder  multiple choice hai
		 boolean B= true;
		 int no = 9 ;
		 if(no==5) {
			 System.out.println("no is not 9");
		 }
		 else if(no==6) {
			 System.out.println("no is 6");
		 }
		 else if(no==9) {
			 System.out.println("count 1");
		 }
		 else {
			 System.out.println("there is no more 9");
		 }
		 
		 
		 //Switch statement
		 String days = "sunday";
		 // (days) = expression it should be int, byte, short, char
		 switch(days) { 
		 case "monday":
			 System.out.println("monday");
			 break;
		 case "tuesday": 
			 System.out.println("tuesday");
			 break;
		 
		 case "wednesday":
			 
			 System.out.println("wednesday");
		 break;
		 case "sunday":
			 
			 System.out.println("sunday");
		 break;
		 
		 default: 
			 System.out.println("no more days ");
		 }
		 // java 8 syntax switch statement
		 // java 14 syntax is this 
		  
		 
	//	 case 1 -> System.out.println("this is also valid");
		 
		 int day =2;
		 String result = switch(day) {
		 
		 case 1 ->"Monday";
		 case 2 -> "Tuesday";
		 default -> "Invaild";
		 };
		 
		 System.out.println(result);
		 
		 int k=9;
		 switch(k) {
		 
		 case 1: System.out.println("this is not K"); 
		 break;
		 
		 case 9: 
		 switch(k) {
		 case 1: System.out.println("nested switch");
		 break;
		 }
		 }
	}
}
