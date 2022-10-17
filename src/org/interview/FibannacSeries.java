package org.interview;

import java.util.Scanner;

public class FibannacSeries {
	//fibannac series number is 0 1 1 2 3 5 8 13 = how to work this function 0+1= 1 1+1=2 2+1=3
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit :");
		int n=s.nextInt();
		int a=-1,b=1,c;
		for (int i=1;i<=n;i++) { //1<=5 2<=5 3<=5 4<=5 5<=5 6<=5
			
			c=a+b;//-1+1=0 1+0=1 0+1=1  
			
			System.out.println(c); // 0 1 1 2 3 5 8
			a=b; //a=1 0 1 1 2 3

			b=c; //b=0 1 1 2 3 5
		}
		
	}

}
