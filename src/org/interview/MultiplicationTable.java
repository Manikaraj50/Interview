package org.interview;

import java.util.Scanner;
//write a program in multiplication table

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Table :");
		int n=s.nextInt();
		System.out.println("Enter the limit :");
		int l=s.nextInt();
		for(int i=1;i<=l;i++) {
			System.out.println(n+"*"+i+"="+(n*i));
		}
		
		
		
	}

}
