package primenumber;

import java.util.Scanner;

public class primeNumber {
	public static void main(String[] args) {
		/// rime number can be not divisible by any other number
		// it only has exactly two divisor 1 itself
		
		boolean isPrime= true;
		for(int i=1;i<=5;i++) { //i=3
			if(i<2) {
				//isPrime=false; // sysout("not prime");
				System.out.println("not prime"+i);
			}
			else {
				int count =0;
				for(int j=2;j<i;j++)
				{
					if(i%j==0) {
						count++;
						
					}
				}
				if(count==0) {
					//isPrime=true;
					System.out.println("PRime"+i);
				}
				else {
					
					//isPrime=false;
					System.out.println("not prime"+i);
				}
			}
		}
		
		
		
		
		
		
		
	}
}
