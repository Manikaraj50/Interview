package org.interview;

import java.util.Scanner;
//the factorial number is : 55

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter the Factorial Number :");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int factorial = 1;
		for(int i=1;i<=number;i++) {
			factorial=factorial*i;
		}
		System.out.println("the factorial of :"+factorial);
	}

}
