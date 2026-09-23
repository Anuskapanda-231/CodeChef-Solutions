# LJAAS49

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Write a program that takes the radius of a circle as input and prints its area. (use $\pi$ = 3.14)

### Sample 1:
Input
Output

```
5
```

```
78.5
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T06:46:45.284Z  

```java
import java.util.Scanner;
class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        
        double pi = 3.14 ;
        
        int r =sc.nextInt();
        
        System.out.println(pi*r*r);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS49)