import java.util.*;
public class LCS_RECURSIVE {

	public static int lcs(String x,String y,int m,int n) {
		
		if(m==0 || n==0) {
			return 0;
		}
		
		if(x.charAt(m-1)==y.charAt(n-1)) {
			return 1+lcs(x,y,m-1,n-1);
		}
		
		else {
			
			return Math.max(lcs(x,y,m-1,n),lcs(x,y,m,n-1));
		}
		
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String x=sc.next();
      String y=sc.next();
      int m=x.length();
      int n=y.length();
      System.out.println("Length:"+lcs(x,y,m,n));
	}

}
