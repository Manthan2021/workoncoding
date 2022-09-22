import java.util.*;
public class CONVERT_STRING {

	static int lcs(String x,String y,int m,int n) {
		
		int L[][]=new int[m+1][n+1];
		int i,j;
		
		for(i=0;i<=m;i++) {
			for(j=0;j<=n;j++) {
				
				if(i==0 || j==0) {
					L[i][j]=0;
				}
				
				else if(x.charAt(i-1)==y.charAt(j-1)) {
					L[i][j]=1+L[i-1][j-1];
				}
				
				else {
					L[i][j]=Math.max(L[i-1][j],L[i][j-1]);
				}
				
			}
		}
		
		return L[m][n];
	}
	
	static void convert(String a,String b) {
		int m=a.length();
		int n=b.length();
		int l=lcs(a,b,m,n);
		
		if(m>n) {
			System.out.println("Deletion:"+(m-l));
		    System.out.println("Insertion"+(n-l));
		}
		
		else {
			System.out.println("Deletion:"+(n-l));
			System.out.println("Insertion:"+(m-l));
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
      String a=sc.next();
      String b=sc.next();
      convert(a,b);
      
	}

}
