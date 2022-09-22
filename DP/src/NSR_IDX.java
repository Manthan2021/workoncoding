import java.util.*;
public class NSR_IDX {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Stack<Integer> st1=new Stack<Integer>();
		Stack<Integer> st2=new Stack<Integer>();
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
		System.out.println("--------------------------------------");	

		for(int i=0;i<n;i++) {
			System.out.println(""+NSR_IDX[i]);
		}
		
		}
			
	}
	
		

