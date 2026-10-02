# ERROR - Rating 980

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T15:52:53.407Z  

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

```

---

[View on CodeChef](https://www.codechef.com/problems/ERROR)