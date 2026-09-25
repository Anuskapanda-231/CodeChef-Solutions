import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static String findterm(String s ,String t){
        
        
    
        boolean isFound = false ;
       for (int i = 0; i <= s.length() - t.length(); i++)
        {
            String part = s.substring(i, i + t.length());

            if (part.equals(t))
            {
                isFound = true;
                break;
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
