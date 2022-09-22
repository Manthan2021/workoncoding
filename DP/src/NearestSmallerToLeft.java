import java.util.*;
public class NearestSmallerToLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
        Stack<Integer> stack=new Stack<Integer>();
        int NSL[]=new int[n];
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++) {
        	if(stack.isEmpty()) {
        		NSL[i]=-1;
        	}
        	else if(stack.isEmpty() && stack.peek()<a[i]) {
        		NSL[i]=stack.peek();
        	}
        	
        	else if(!stack.isEmpty() && stack.peek()>=a[i]) {
        		while(!stack.isEmpty() && stack.peek()>=a[i]) {
        			stack.pop();  			
      
        		}
        	
        	}
        	if(stack.isEmpty()) {
        		NSL[i]=-1;
        	}
        	
        
        	else {
        		NSL[i]=stack.peek();
        	}
        	
        stack.push(a[i]);	
        }
        System.out.println("----------------------------------");
        for(int i=0;i<n;i++) {
        	System.out.println(""+NSL[i]);
        }
        
	}
}
