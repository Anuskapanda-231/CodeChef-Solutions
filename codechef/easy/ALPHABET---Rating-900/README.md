# ALPHABET - Rating 900

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-01T06:43:50.234Z  

```java
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

```

---

[View on CodeChef](https://www.codechef.com/problems/ALPHABET)