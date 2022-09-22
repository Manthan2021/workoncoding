import java.util.*;
public class MaximumAreaHistogram {
	static int[] NSL_IDX(int a[]) {
		Stack<Integer> s1=new Stack<Integer>();
		Stack<Integer> s2=new Stack<Integer>();
		int n=a.length;
		int NSL[]=new int[n];
		int NSL_IDX[]=new int[n];
		
		for(int i=0;i<n;i++) {
			if(s1.isEmpty() && s2.isEmpty()) {
				NSL[i]=-1;
				NSL_IDX[i]=-1;
			}
			else if(!s1.isEmpty() && !s2.isEmpty() && s1.peek()<a[i]) {
				NSL[i]=s1.peek();
				NSL_IDX[i]=s2.peek();
			}
			else if(!s1.isEmpty() && !s2.isEmpty() && s1.peek()>=a[i]) {
	          			while(!s1.isEmpty() && s1.peek()>=a[i]) {
	          				s1.pop();
	          				s2.pop();
	          			}
			}
			
			if(s1.isEmpty() && s2.isEmpty()) {
				NSL[i]=-1;
				NSL_IDX[i]=-1;
			}
			else {
				NSL[i]=s1.peek();
				NSL_IDX[i]=s2.peek();
			}
			
			s1.push(a[i]);
			s2.push(i);
		}
		return NSL_IDX;
		
	}
	
	static int[] NSR_IDX(int a[]) {
		Stack<Integer> st1=new Stack<Integer>();
		Stack<Integer> st2=new Stack<Integer>();
		int n=a.length;
		int NSR[]=new int[n];
		int NSR_IDX[]=new int[n];
		for(int i=n-1;i>=0;i--) {
			if(st1.isEmpty() && st2.isEmpty()) {
				NSR[i]=-1;
				NSR_IDX[i]=n;
			}
			else if(!st1.isEmpty() && !st2.isEmpty() && a[i]<st1.peek()) {
				while(!st1.isEmpty() && a[i]<st1.peek()) {
					st1.pop();
					st2.pop();
				}
				
			}
			if(st1.isEmpty() && st2.isEmpty() )  {
				NSR[i]=-1;
				NSR_IDX[i]=n;
			}
			else {
				NSR[i]=st1.peek();
				NSR_IDX[i]=st2.peek();
			}
			st1.push(a[i]);
			st2.push(i);
		}			
		
		return NSR_IDX;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int NSR_INDEX[]=NSR_IDX(a);
		int NSL_INDEX[]=NSL_IDX(a);
		int w[]=new int[n];
		for(int i=0;i<n;i++) {
			w[i]=NSR_INDEX[i]-NSL_INDEX[i]-1;
			System.out.println(w[i]*a[i]);
		}
		
			
	}
	
}
