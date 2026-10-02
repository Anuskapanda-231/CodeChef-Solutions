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
		    String s = sc.next();
		    boolean isvalid =true;
		    for(int i=0;i<s.length()-1;i+=2){
		        if(s.charAt(i)==s.charAt(i+1)){
		            isvalid=false;
		            break;
		        }
		        isvalid=true;
		    }
		    if(isvalid){
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		}

	}
}
