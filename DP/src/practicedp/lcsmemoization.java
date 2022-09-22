package practicedp;

import java.util.Arrays;
import java.util.Scanner;

public class lcsmemoization {
	static final int maximum=1000;
	
	static int lcs(String x,String y,int m,int n,int dp[][]) {
		if(m==0 || n==0) {
			return 0;
		}
		if(dp[m-1][n-1]!=-1) {
			return dp[m-1][n-1];
		}
		if(x.charAt(m-1)==y.charAt(n-1)) {
			dp[m-1][n-1]=1+lcs(x,y,m,n,dp);
			return  dp[m-1][n-1];
			
		}
		else {
			dp[m-1][n-1]=Math.max(lcs(x,y,m,n-1,dp),lcs(x,y,m-1,n,dp));
			return dp[m-1][n-1];
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String x=sc.next();
		String y=sc.next();
		int m=x.length();
		int n=y.length();
		int dp[][]=new int[m][maximum];
		for(int[] row:dp) {
			Arrays.fill(row,-1);
		}
		System.out.println("Length of lcs:"+lcs(x,y,m,n,dp));
		
	}

}
