package org.interview;

import java.util.Scanner;
 //write a program to check the given number is perfect number or not perfect number
public class PerfectNumber {
	
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=s.nextInt();//6
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;// 1 2 3 = 6
				//how to calculate for this its factor number
				/* Example : n=6
				 *   1 / 6 = 0
				 *   2 / 6 = 0
				 *   3 / 6 = 0
				 *  (+)_
				 *   6 this perfect number(don't consider the 6/6=0)
				 */
				
			}
		}
		if(n==sum) {
			System.out.println(n +"   number is perfect number");
		}
		else {
			System.out.println(n+"   number is not perfect");
		}
		}

}
