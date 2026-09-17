# MAXCONSECU - Rating 970

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T16:29:51.485Z  

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
            
        int N = sc.nextInt();
       
        int[] arr = new int[N];
        
        int totalsum =0;
        int minval=Integer.MAX_VALUE;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            totalsum+=arr[i];
            minval= Math.min(minval,arr[i]);
        }
        System.out.println(totalsum-minval);
        }
        
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MAXCONSECU)