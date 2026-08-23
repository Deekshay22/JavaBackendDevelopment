package com.loops;

public class loops {
	public static void main(String[] args) {
		for(int I=1; I<=13;I++) {
			System.out.println("@");
		}
		
		// Java loops and jump statement
		for(int m=1, n=1; m<=10 && n<=5; m++, n++) {
			System.out.println(m*n);
		}
		
		boolean b= true;
		for(int i=1; b==true; i++) {
			if(b==true) {
				b= false;
				System.out.println(b);
			}
		}
	}
}
