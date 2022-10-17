package org.interview;

import java.util.Arrays;

// program to insert a element in specific index on array 

public class InsertaElementInArray {
        public static void main(String[] args) {
			int[] a=new int[] {10,20,30,40,50,60,70,80,90,100};
			int  index=3;
			int value=33;
			
			         //index length value is decrement
			for(int i=a.length-1;i>index;i--) {
				a[i]=a[i-1];
			}
			a[index]=value;
			System.out.println("Insert a element in array :"+Arrays.toString(a));
		}
        
}
