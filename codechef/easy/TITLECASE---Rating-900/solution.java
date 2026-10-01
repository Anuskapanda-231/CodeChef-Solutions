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
		    
		    String[] words = s.split(" ");
		    
		    StringBuilder sb = new StringBuilder();
		    
		 
		    
		    for (String word : words){
		        
		      if(word.equals(word.toUpperCase())){
		          sb.append(word);
		          
		      }
		      else{
		          word =word.toLowerCase();
		          sb.append(Character.toUpperCase(word.charAt(0)) + word.substring(1));
		      
		      }
		  
		         sb.append(" ");
		    }
		    System.out.println(sb.toString().trim());
		}

	}
}
