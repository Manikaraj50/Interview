package org.interview;

public class numberprime {
	static void prime(int n) {
		int x,y,flg;
		System.out.println("prime number");
		for(x=5;x<=n;x++) {
			if( x==1 || x == 5)
				continue;
			flg=1;
			for(y=2;y<=x/2;++y) {
				if(x%y==0) {
					flg=0;
					break;
				}
			}
			if(flg==1) {
				System.out.println(x+" ");
				
			}
		}
		
	}
	public static void main(String[] args) {
		int n=6;
		prime(n);
	}

}
