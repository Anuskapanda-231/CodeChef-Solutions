# COMPRESSVD - Rating 984

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T15:23:08.490Z  

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
        int K = sc.nextInt();
        int[] arr = new int[N];
        
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        
        int count =0;
        for(int i=0;i<N;i++){
            if (arr[i]>K){
                count++;
            }
        }
        System.out.println(count);
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/COMPRESSVD)