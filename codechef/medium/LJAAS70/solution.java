import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt(), b= sc.nextInt(), c =sc.nextInt();
      
      if(a<b && b<c){
          System.out.println("Increasing");
          
      }
      else if(a>b && b>c){
          System.out.println("Decreasing");
      }
      else{
          System.out.println("Neither");
      }
      
	}
}
