import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static String findterm(String s ,String t){
        
        
        String[] word = s.split(" ");
        boolean isFound = false ;
        for(String words : word){
            if(words.equals(t)){
                isFound=true;
            }
            
        }
        
        return isFound ? "YES" : "NO";
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		String s =sc.nextLine();
		String t = sc.nextLine();
		
		System.out.println(findterm(s,t));

	}
}
