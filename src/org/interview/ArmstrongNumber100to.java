package org.interview;

//write a program to find the armstrong number 100-999
public class ArmstrongNumber100to {
	public static void main(String[] args) {
		int d1,d2,d3,res,temp;
		for(int number=100;number<=999;number++) {
			
			temp=number;//153
			d3=temp%10;//3
			temp=temp/10;//15
			
			d2=temp%10;//5
			temp=temp/10;//1
			 
			d1=temp%10;//1
			
			res=(d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
			
			
			if(number==res) {
				System.out.println("this is armstong number:"+number);
			}
			
			
			
			
			
			
			
			
		}
	}

}
