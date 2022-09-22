import java.util.*;
public class matrixchainmultiplication {

	static int matrixchainorder(int p[],int i,int j) {
		
		if(i==j) {
			return 0;
		}
		
		int min=Integer.MAX_VALUE;
		
		for(int k=i;k<j;k++) {
		int	count=matrixchainorder(p,i,k)+matrixchainorder(p,k+1,j)+p[i-1]*p[k]*p[j];
			if(count<min) {
				min=count;
			}
		}
		return min;
	}
	public static void main(String args[]) {
		int arr[]=new int[] {1,2,3,4,3};
		int n=arr.length;
		System.out.println("maximum no. of multiplication "+matrixchainorder(arr,1,n-1));
		
	}
}
