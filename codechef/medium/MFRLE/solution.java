import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{   
    
    
    public static char getmostfreqletter(String s){
        
        int[] freq = new int[25];
        
        for(int i=0;i<s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));
            
            if(Character.isLetter(ch)){
                freq[ch-'a']++;
            }
        }
        
        int maxval=0;
        char answer ='a';
        for(int i=0;i<25;i++){
            if(freq[i]>maxval){
                maxval=freq[i];
                answer =(char) (i +'a');
            }
        }
        return answer;
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println(getmostfreqletter(s));

	}
}
