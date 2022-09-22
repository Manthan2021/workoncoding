import java.util.*;
public class NearestSmallerToRight {
public static void main(String args[]) {

	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int count=0;
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	Stack<Integer> st=new Stack<Integer>();
	int NSR[]=new int[n];
	for(int i=n-1;i>=0;i--) {
		if(st.isEmpty()) {
			NSR[i]=-1;
		}
//		if(!st.isEmpty() && a[i]>st.peek()) {
//			
//		}
		else if(!st.isEmpty() && a[i]<st.peek()) {
			while(!st.isEmpty() && a[i]<st.peek()) {
				st.pop();
			}
			
		}
		if(st.isEmpty()) {
			NSR[i]=-1;
		}
		else {
			NSR[i]=st.peek();
		}
		st.push(a[i]);
	}
	System.out.println("-----------------------------");
	for(int i=0;i<n;i++) {
		System.out.println(""+NSR[i]);
		
	}
	
}
	
}
