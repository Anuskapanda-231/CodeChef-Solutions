import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc =new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int n =sc.nextInt();
		sc.nextLine();
		String w = new String();
		
		boolean canread=true ;
		for(int i=0;i<n;i++)
		{
		    w = sc.nextLine();
		    for(int j=0;j<w.length();j++){
		        char ch = w.charAt(j);
		        if(s.indexOf(ch)==-1){
		            canread = false;
		            break;
		        }
		        canread =true;
		    }
		    
		    if(canread){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		  
		}
		
	
        
	}
}
