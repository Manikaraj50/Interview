package org.interview;

import java.util.Scanner;
  //write the program a prime number 100 to 999
public class PrimeNumber100to999 {
	public static void main(String[] args) {
		
		System.out.println("Enter the number :");
		
		int f=0;
		for( int n=100;n<=999;n++) {
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					f++;
				}
			}
			if(f==2) {
				System.out.println("this is primme number :"+n);
			}
			f=0;
		}
	}

}
