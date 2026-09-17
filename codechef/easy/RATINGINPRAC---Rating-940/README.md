# RATINGINPRAC - Rating 940

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T15:41:23.540Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        
        Scanner sc = new Scanner(System.in);
          int t = sc.nextInt();
        
        while(t-->0){
            
        int N = sc.nextInt();
       
        int[] arr = new int[N];
        
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int j=1 ,count =0;
        for(int i=0;i<N-1;i++){
            if(arr[i]==arr[j]){
                count++;
            }
            j++;
        }
        System.out.println(N-count);
        }
        
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/RATINGINPRAC)