# MFRLE

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T06:29:23.267Z  

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
		
		String S = sc.nextLine();
		
		HashMap<String,Integer> map = new HashMap<>();
		
	    for(int i =0; i<S.length()-1;i++){
	        String pair =S.substring(i,i+2);
	        
	        map.put(pair,map.getOrDefault(pair,0)+1);
	    }	
        
        int count =0 ;
        
        for(int num : map.values()){
            if(num>=2){
                count++;
            }
        }
        System.out.println(count);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MFRLE)