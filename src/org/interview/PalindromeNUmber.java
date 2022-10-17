package org.interview;

import java.util.Scanner;

//Write a program the given number is a palindrome or not
            /* Example = 141 
             *    input value is reverse number =141 ( its palidrome)
             */

public class PalindromeNUmber {
      public static void main(String[] args) {
		
    	 Scanner s=new Scanner(System.in);
    	 System.out.println("Enter the number :");
    	 int n=s.nextInt();  //141
    	 int originalNumber =n;
    	 int num,Number=0;;
    	 while(n>0) {
    		 num=n%10;  //1 4 1
    		 Number=(Number*10)+num; //(0*10)+1 (1*10)+4 (14*10)+1
    		 n=n/10;	// 14 1 0
    	 }
    	 if(Number==originalNumber) {
    		 System.out.println(originalNumber+": this palindrome number ");
    	 }else {
    		 System.out.println(originalNumber +":its not a palindrome number");
    	 }
    	 
	}
}
