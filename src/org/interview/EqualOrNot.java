package org.interview;

import java.util.Arrays;

public class EqualOrNot {
		public static void main(String[] args) {
			int [] a= {1,2,3,4,5};
			int [] a1= {1,2,3,4,5};
			boolean equals = Arrays.equals(a	,a1);
			if(equals==true) {
				System.out.println("equals");
			}else {
				System.out.println("not equals");
			}
			
			
			

		}
}
