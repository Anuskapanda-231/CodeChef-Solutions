# LJAAS150

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T07:25:42.739Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int exponent = scanner.nextInt();
        
        int result = calculatePower(base, exponent);
        System.out.println(result);    
    }
    
    public static int calculatePower(int base, int exponent) {
        // Complete the method 
          int pow =1;
        for (int i=1; i<=exponent;i++){
            pow = pow*base;
        }
      return pow ;
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS150)