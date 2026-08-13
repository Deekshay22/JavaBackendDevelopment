package com.variables;

public class VariableStructure {
	public static void main(String[] args) {
		
		// declare and assign
		int age;
		age=10;
		System.out.println(age);
		
		// define or initialize
		int totalMarks =20;
		System.out.println(totalMarks);
		
		// Case sensivity
		int chairprice=2000;
		int CHAIRPRICE=4000;
		System.out.println(chairprice);
		System.out.println(CHAIRPRICE);
		
		//Starting Letter
		int mark=10;
		int MARK=20;
		int _mark=30;
		int $mark=40;
		
		// subsequent letter
		int marktotal12= 34;
		int age_2026 = 45;
		int age$ = 12;
		
		// no reserved keyword which means used by java are not use as variable
		// int class= 12;
		/* Java keywords: 
		class
		public
		static
		void
		int
		if
		else
		for
		while
		return
		new */
		
		
		//variable name should be meaning full so that easy to under stand 
		//int a =10 // it dose not reflect mean what a which a ?
		int student_count =10;
		
		//Convention - camalCase, UpperCase for constant
		
		//	constant
		int DAY_IN_YEAR= 365;
		
		//camelCase- if having multiple words then how do we create single variable name
		
		String expireDateOfMilk= "31-08-2026";
		
		System.out.println(expireDateOfMilk);
		
		
		
	}
	
}
