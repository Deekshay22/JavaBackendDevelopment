package in.arrays;

import java.util.Iterator;

public class Rollno {
	public static void main(String[] args) {
	
		int []arr= new int[8];
		arr[0]=12;
		arr[1]=13;
		
		int x=10;
		for(int i=0;i<3;i++) {
			arr[i]= x;
			x++;
		}
		
		for(int i=0;i<3;i++) {
			
			System.out.println(arr[i]);
		}
		
		
		///Multi dimensional array -> each array with different size
		int[][] marks = new int[3][];
		marks[0]= new int[1];
		marks[1]= new int[2];
		marks[2]= new int[3];
		
		System.out.println(marks.length);
        
 		/* 
 		[]
		[] []
		[] [] []
		*/
		 marks[0][0]= 23;
		 
		 marks[1][0]= 45;
		 marks[1][1]= 56;
		 
		 marks[2][0]= 43;
		 marks[2][1]= 42;
		 marks[2][2]= 43;
		 
//		System.out.println(marks[0][0]);
//		System.out.println(marks[1][0]);
//		System.out.println(marks[1][1]);
//		System.out.println(marks[2][0]);
//		System.out.println(marks[2][1]);
//		System.out.println(marks[2][2]);
		 
		
		System.out.println();
		for(int i=0;i<marks.length;i++) {
			for(int j=0;j<marks[i].length;j++) {
				System.out.print(marks[i][j] +" ");
			}
			System.out.println();
		}
		
		//1-D array can be declare like this also
		int[] rollnumber= {23, 23, 24};
		for(int i=0;i<rollnumber.length;i++) {
			System.out.println(rollnumber[i]);
		}
		
		System.out.println();
		//2-D array
		int[][] arrays= {
				{12, 13, 14},
				{12, 13, 14},
				{12, 12, 12},
		};
		for(int i=0;i<arrays.length;i++) {
			for(int j=0;j<arrays[i].length;j++) {
				System.out.print(arrays[i][j] +" ");
			}
			System.out.println();
		}
		
		//3-D arrays
		//Suppose you have 2 floors, each floor has 3 rows, and each row has 4 rooms:
		//int[][][] threeDarray = new int[2][3][4];
		
		
} 
}
