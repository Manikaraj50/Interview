package org.interview;

//write a program to the print a duplicate element in array

public class DuplicateElementInArray {
	public static void main(String[] args) {
		int[]a=new int[] {5,8,3,6,7,86,5,2,4};
		
		/* index  0 1 2 3 4 5 6 7 8    
		 * value  5 8 3 6 7 8 5 2 4  
		 * 
		 * 			0   5
		 *          1   8
		 *      	2   3
		 *      	3	6
		 *      	4   7
		 *      	5	8
		 *      	6   5
		 *      	7	2
		 *      	8   4
		 */
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if((a[i]==a[j]) && (i!=j)) {
					System.out.println("Print the duplicate number "+a[j]);
				}
			}
		}
	}

}
