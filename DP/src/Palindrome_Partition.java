
public class Palindrome_Partition {

	static boolean isPalindrome(String s,int i,int j) {
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	static int minPalPartition(String s,int i,int j) {
		if(i>=j || isPalindrome(s,i,j)) {
			return 0;
		}
		int ans=Integer.MAX_VALUE,count;
		for(int k=i;k<j;k++) {
			count=minPalPartition(s,i,k)+minPalPartition(s,k+1,j)+1;
			ans=Math.min(ans, count);
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ababbbabbabab";
		System.out.println("Minimum cuts needed for palindrome partitioning is"+minPalPartition(str,0,str.length()-1));

	}

}
