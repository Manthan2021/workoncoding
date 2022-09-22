import java.util.*;
public class longest_palindromic_substring {

	static int lcs(String x,String y,int m,int n) {
		int[][] L=new int[m+1][n+1];
		for(int i=0;i<=m;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0 || j==0) {
					L[i][j]=0;
				}
				
				else if(x.charAt(m-1)==y.charAt(n-1)) {
					L[i][j]=L[i-1][j-1]+1;
				}
				
				else {
					L[i][j]=Math.max(L[i-1][j],L[i][j-1]);
				}
				
				
			}
		}
		return L[m][n];
	}
	
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    StringBuilder s1=new StringBuilder();
    s1.append(s);
    s1.reverse();
    String s2=s1.toString();
    //String s2="ABCDAF";
    int m=s.length();
    int l=lcs(s,s2,m,s2.length());
		System.out.println("length: "+l);
	}

}
