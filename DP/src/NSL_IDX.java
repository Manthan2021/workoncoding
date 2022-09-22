import java.util.*;
public class NSL_IDX {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	Stack<Integer> s1=new Stack<Integer>();
	Stack<Integer> s2=new Stack<Integer>();
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
	System.out.println("--------------------------------------------------");
	for(int i=0;i<n;i++) {
		System.out.println(""+NSL[i] +"  "+NSL_IDX[i]);
		
		
	}

}
}
