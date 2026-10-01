# PLAYPIAN - Rating 977

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-01T15:24:34.466Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            String r = scanner.next();
            
            StringBuilder sb = new StringBuilder();
            int countone =0;
            for(int i=0; i<n;i++){
                if(s.charAt(i)!=r.charAt(i)){
                    countone++;
                }
               
            }
           
            if(countone%2==0){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PLAYPIAN)