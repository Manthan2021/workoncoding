import java.util.*;
import java.util.Stack;
public class StockSpan {

	private static int[] findNGL(int a[]) {
		int n=a.length;
		int[] NGL=new int[n];
		int[] NGL_IDX=new int[n];
		
		Stack<Integer> s1=new Stack<>();
		Stack<Integer> s2=new Stack<>();
		
		for(int i=0;i<n;i++) {
			NGL[i]=-1;
			NGL_IDX[i]=-1;
			
			while(!s1.empty() && !s2.empty()) {
				int top=s1.peek();
				int top_idx=s2.peek();
				
				if(top>a[i]) {
					NGL[i]=top;
					NGL_IDX[i]=top_idx;
					break;
				}
				else {
					s1.pop();
					s2.pop();
				}
			}
				s1.push(a[i]);
			    s2.push(i);	
		
			}
		return NGL_IDX;
		}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int x[]=findNGL(a);
		for(int i=0;i<n;i++) {
	     System.out.println(""+(i-x[i]));
		}

	}
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

