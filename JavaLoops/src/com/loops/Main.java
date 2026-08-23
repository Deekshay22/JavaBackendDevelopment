package com.loops;

public class Main {
	public static void main(String[] args) {
		// while loop --> infinite 
		int i=5;
		while(i<10) {
			
		}
		
	//	int i=1;
		while(i<=10) { // boolean --> true /false
			System.out.println("check check");
			i++;
		}
		
		System.out.println();
		int j=10;
		while(j>=1) { // boolean --> true /false
			System.out.println("check check");
			j--;
		}
		System.out.println();
		
		while(i++ <=10) {
			System.out.println(i);
		}
		
		// Do while loop
		int a=1;
		do {
			System.out.println(a);
			a++;
		} while(a<=10);
		
		//for loop
		for(int I=1; I<=13;I++) {
			System.out.println("@");
		}
		
		// Java loops and jump statement
		for(int m=1, n=1; m<=10 && n<=5; m++, n++) {
			System.out.println(m*n);
		}
		
	}
}
