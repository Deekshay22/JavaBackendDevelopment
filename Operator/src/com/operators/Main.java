package com.operators;

public class Main {
	public static void main(String[] args) {
		//Arithmetic 
		int num1= 5;
		int num2 = 12;
		
		System.out.println("Addition " + (num1 + num2));
		System.out.println("Minus "+( num1 - num2));
		System.out.println("Multiple "+ (num1 * num2));
		System.out.println("Divide " + num2 / (double)num1);
		System.out.println("Remainder " + (num2 % num1));
		
		// relational 
		int a = 10;
		int b= 10;
		
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		
		System.out.println();
		
		//logical operator
		
		int number1= 12;
		int number2 =12 ;
		int number3 = 18;
		
		System.out.println((number1==number2)&& (number1==number3));
		System.out.println((number1==number2) || (number1==number3));
		System.out.println(!(number1==number2));
		
		System.out.println();
		
		//Assignment Operator
		
		int x = 12;
		x = x+1;
		System.out.println(x);
		
		int y = 22;
		y += 2;
		System.out.println(y);
		
		int z = 34;
		System.out.println(z);
		z -= 20;
		System.out.println(z);
		z *= 10;
		System.out.println(z);
		
		z = z/10;
		System.out.println(z);
		
		z %= 10;
		System.out.println(z);
		
		System.out.println();
		// Unary operators
		
		int c= 5;
		//c++ ; // a= a+1;
		System.out.println(c++);
		System.out.println(c);
		
		System.out.println();
		int e=9;
//		System.out.println(e++);
//		System.out.println(e  );
//		System.out.println(++e);
		// a--; // a= a-1;
		
		 System.out.println(--e); // pre decrement
		 
		 System.err.println(e--); // post decrement
		 System.out.println(e);
		
	}
}
