package org.interview;

import java.util.Scanner;

//write a program to find the sum of average number of given number

public class AverageNumber {
	public static void main(String[] args) {
		System.out.println("Enter the limit:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;// sum =0 is must the input value is 0 mention 
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the i number " +i+" :");
			int a=s.nextInt();
			sum+=a; //sum=sum+a
			/* this function is first initialization sum=0 and a method complete add on 10 sum=10
			 * next a loop run to add on 20 total value is 30 (sum=10+20) =30
			 */
			
		}
		System.out.println("the sum of given number : "+sum);
		System.out.println("the sum of avg number: "+ sum/n);
	}
}
