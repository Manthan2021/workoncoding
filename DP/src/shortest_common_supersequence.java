
public class shortest_common_supersequence {

	static int shortestsupersequence(String x,String y) {
		
		int m=x.length();
		int n=y.length();
		int l=lcs(x,y,m,n);
		return(m+n-l);
				
	}
	
	static int lcs(String x,String y,int m,int n) {
		
		int[][] L=new int[m+1][n+1];
		int i,j;
		for(i=0;i<=m;i++) {
			for(j=0;j<=n;j++) {
				if(i==0 || j==0) {
					L[i][j]=0;
				}
				
				else if(x.charAt(i-1)==y.charAt(j-1)) {
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
		// TODO Auto-generated method stub
		String x="AGGTAB";
		String y="GXTXAYB";
		System.out.println("Length of shortest super sequence is "+shortestsupersequence(x,y));
				

	}

}
