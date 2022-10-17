package org.interview;

import java.util.Scanner;

// write the program to given the number is calculate the count number
public class CountNumber { 
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter the number :");
		 int n=s.nextInt();  //1456
		 int count=0;
		 while(n!=0) { // true
			 n= n/10; //145 14 1 0
			 count++; // 1 2 3 4
			 
		 }
		 System.out.println("the number of digits "+count);
	}

}
