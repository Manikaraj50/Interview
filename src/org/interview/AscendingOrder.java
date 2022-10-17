package org.interview;

import java.util.Arrays;
    //Write a program to given number to print the ascending order
public class AscendingOrder {
	public static void main(String[] args) {
		int a[]={64,3,54,983,21,45,2};
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if(a[i]>a[j]) // change the operator (output is descending order =a[i]<a[j])
					{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			
		}
		System.out.println("Ascending oredr :"+Arrays.toString(a));
	}

}
