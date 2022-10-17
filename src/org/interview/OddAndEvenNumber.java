package org.interview;

import java.util.Scanner;


 //write a program the given number to calculate the odd or even number


public class OddAndEvenNumber {
	 public static void main(String[] args) {
		 int oddNumber=0,EvenNumber=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit :");
		int n=s.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the value :");
			a[i]=s.nextInt();
			
		}
		for (int x : a) {
			if(x%2==0) {
				
				oddNumber++;
		}else {
			EvenNumber++;
		}
		}
		System.out.println("the total even number  :"+oddNumber);
		System.out.println("the total odd number :"+EvenNumber);
	}

}
