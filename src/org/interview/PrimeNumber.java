package org.interview;

import java.util.Scanner;
 //write a program in given number prime or not
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=s.nextInt();
		
		int f=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				f++;
				}
		}
				if(f==2) {
					System.out.println("This is prime number");
				}else {
					System.out.println("this not a prime number");
				}
			}
		}

