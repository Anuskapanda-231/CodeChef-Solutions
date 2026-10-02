import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		int t =sc.nextInt();
		
		while(t-->0){
		    String s= sc.next();
		    
		    boolean isGoodFeedback =false;
		    
		    for(int i=0;i<s.length()-2;i++){
		        char first = s.charAt(i);
		        char second = s.charAt(i+1);
		        char third = s.charAt(i+2);
		        
		        if(first != second && first==third){
		            isGoodFeedback=true;
		            break;
		        }
		       
		    }
		    
		    if(isGoodFeedback){
		        System.out.println("Good");
		    }
		    else{
		        System.out.println("Bad");
		    }
		}

	}
}
