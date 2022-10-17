package org.interview;

public class MaximumNumber {
	public static void main(String[] args) {
		int a[]= {10,20,65,93,47,30};
		int max=a[0];
		for(int i=1;i<=a.length;i++)
		{
			if(a[i]>max) {
				max=a[i];
			
		}
	}
		System.out.println("maximum element in array"+max);
	
		
//	String name="jona,sin,shan,tins";
//	String[] split=name.split(",");
//
//for(String s : split)
//{
//	System.out.println(s);
////}
//		String str1="abc";
//		String str2="xyz";
//		String str3="por";
//		StringBuffer s=new StringBuffer(str1.concat(str2).concat(str3));
//		System.out.println(s);
//		int identityHashCode = System.identityHashCode(str1.concat(str2).concat(str3));
//		System.out.println(identityHashCode);
}
}
