import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{    
	    
	    Scanner sc =new Scanner(System.in);
		// your code goes here
         char input = sc.next().charAt(0);
         
         char lower = Character.toLowerCase(input);
         
         switch(lower){
             case 'a':
             case 'e':
             case 'i':
             case 'o':
             case 'u':
                 System.out.println("Vowel");
                 break;
             default:
                 System.out.println("Consonant");
                 
            
         }
	}
}
