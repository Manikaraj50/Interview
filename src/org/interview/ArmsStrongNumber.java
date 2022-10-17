package org.interview;

import java.util.Scanner;
       

//write the program to check whether the given 3 digit number using the armstrong number or not

public class ArmsStrongNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
		int number=s.nextInt();
		int temp=number;
		int d1,d2,d3;
		d3=temp%10;//3
        temp=temp/10;//12
        d2=temp%10;//2
        temp=temp/10;//1
        d1=temp%10;//1
        int res=(d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
        if(res==number) {
        	System.out.println("this is armsStrongNumber");
        	
        }else {
        	System.out.println("this is not"
        			+ " armsStrongNumber");
        	
        }
        
		
		
		
	}

}
