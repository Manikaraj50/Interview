package org.interview;

public class patternNumber {
			public static void main(String[] args) {
				int n=8;
				for(int i=1;i<=5;i++){
					for(int k=1;k<=i;k++) {
						System.out.print(i);
						}
					System.out.println("");
				}
				for(int i=6;i<=9;i++) {
					for(int k=9;k>=i;k--) {
						System.out.print(i);
					}
					System.out.println("");
				}
				
			}
}
