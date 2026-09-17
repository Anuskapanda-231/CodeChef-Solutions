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
        int K = sc.nextInt();
        int[] arr = new int[N];
        
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        
        int count =0;
        for(int i=0;i<N;i++){
            if (arr[i]>K){
                count++;
            }
        }
        System.out.println(count);
        }
	}
}
