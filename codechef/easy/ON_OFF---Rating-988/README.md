# ON_OFF - Rating 988

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-01T14:39:07.339Z  

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

```

---

[View on CodeChef](https://www.codechef.com/problems/ON_OFF)