import java.util.*;
public class MCM_Memoize {

	static int[][]dp=new int[100][100];
	
	static int matrixchainMemoised(int p[],int i,int j) {
		
		if(i==j) {
			return 0;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		dp[i][j]=Integer.MAX_VALUE;
		for(int k=i;k<j;k++) {
			dp[i][j]=Math.min(dp[i][j],matrixchainMemoised(p,i,k)+matrixchainMemoised(p,k+1,j)+p[i-1]*p[k]*p[j]);
			
		}
		return dp[i][j];
		
	}
	
	static int MatrixChainOrder(int[] p,int n) {
		int i=1;
		int j=n-1;
		return matrixchainMemoised(p,i,j);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,2,3,4};
        int n=arr.length;
        for(int[] row:dp) {
        	Arrays.fill(row,-1);
        }
        	System.out.println("Minimum number of multiplication is "+MatrixChainOrder(arr,n));
        	
	}

}
