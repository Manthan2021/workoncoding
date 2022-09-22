package practicedp;

import java.util.Scanner;

public class lcsrecursive {
	
	
	
	public static int lcs(String a,String b,int m,int n) {
		if(m==0 || n==0) {
			return 0;
		}
		if(a.charAt(m-1)==b.charAt(n-1)) {
			return 1+lcs(a,b,m-1,n-1);
			
		}
		else {
			return Math.max(lcs(a,b,m-1,n),lcs(a,b,m,n-1));
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int m=a.length();
		int n=b.length();
		
		System.out.println("length:"+lcs(a,b,m,n));

	}

}
