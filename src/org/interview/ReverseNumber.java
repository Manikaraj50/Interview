package org.interview;

import java.util.Scanner;

//write a program to find the reverse of N digit number 
public class ReverseNumber {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=s.nextInt(); //123
		int reverse=0,rem;
	    while(n!=0)  //123!=0  12!=0
		{
			rem=n%10; // 3
			reverse=(reverse*10)+rem; //(0*10)+3=>3  (3*10)+2=>32
			n=n/10; //12 1
		}
		System.out.println("The reverse Nnumber is :"+reverse);
		
	}

}
