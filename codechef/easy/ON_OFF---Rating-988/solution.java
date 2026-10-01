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
		
		sc.nextLine();
		
		while(t-->0){
		    String s = sc.nextLine();
		    int a =0;
		    int b=0;
		    for(int i=0 ; i<s.length();i++){
		        if(s.charAt(i)=='a'){
		            a++;
		        }
		        else{
		            b++;
		        }
		    }
		    
		    if(a<b){
		        System.out.println(a);
		    }
		    else{
		        System.out.println(b);
		    }
		}
		

	}
}
