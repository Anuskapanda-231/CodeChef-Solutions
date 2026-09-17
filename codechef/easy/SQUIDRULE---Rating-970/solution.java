import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
         Scanner sc = new Scanner(System.in);
          int t = sc.nextInt();
        
        while(t-->0){
            
        int N = sc.nextInt();
       
        int[] arr = new int[N];
        
        int totalsum =0;
        int minval=Integer.MAX_VALUE;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            totalsum+=arr[i];
            minval= Math.min(minval,arr[i]);
        }
        System.out.println(totalsum-minval);
        }
        
	}
}
