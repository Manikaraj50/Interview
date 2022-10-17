package org.interview;

import java.util.Scanner;

//write a program the given number to check the Strong number or not 

      /*Example : input  number is 145 
       *     1! = 1 * 1     =   1
       *     4! = 1*2*3*4   =  24
       *     5! = 1*2*3*4*5 = 120
       *                    ----------
       *                      145 (input number == output number >=(to consider the strong number))
       *                    -----------  
       */

public class StrongNumber {
			public static void main(String[] args) {
				
			 int num,originalnum,rem,fact,sum = 0;
			 Scanner s=new Scanner(System.in);
			 System.out.println("Enter the number :");
			 num=s.nextInt(); //145
			 originalnum=num;
			 while(num>0) {
				 rem=num%10; // rem =5 4 1
			     fact=1; // only inside the value in loop
				 for(int i=1;i<=rem;i++) {
					 fact=fact*i; //125 24 1
				 }
				 sum+=fact; //125+24+1=145
				 num=num/10;//14 1 0(so loop is end)
			 }
			 
			 System.out.println(sum);
			 if(sum==originalnum) {
				 System.out.println(originalnum +" : this number is a strong number");
			 }else {
				 System.out.println(originalnum +" : this number is not a strong number");
			 }
			 
			}
}
