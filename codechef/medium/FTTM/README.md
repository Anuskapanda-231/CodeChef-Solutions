# FTTM

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find the Term

You are given a string $S$ and another string $T$.

Your task is to determine whether $T$ appears in $S$ as a  **contiguous substring**.

The search is case-sensitive, so uppercase and lowercase letters are considered different.

Print `YES` if $T$ occurs in $S$; otherwise, print `NO`.

### Input Format
- The first line contains the string $S$.
- The second line contains the string $T$.
### Output Format
- Print YES if $T$ is present in $S$, Otherwise, print NO.
### Constraints
- $1 \le |S| \le 1000$
- $1 \le |T| \le 100$
- The search is case-sensitive.
### Sample 1:
Input
Output

```
The quick brown fox jumps over the lazy dog
brown
```

```
YES
```

### Explanation:

The string `brown` appears as a contiguous substring of $S$.

Therefore, the answer is `YES`.

### Sample 2:
Input
Output

```
Competitive Programming
programming
```

```
NO
```

### Explanation:

The search is case-sensitive. The string contains `Programming`, but not `programming`.

Therefore, the answer is `NO`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T14:32:46.383Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static String findterm(String s ,String t){
        
        
        String[] word = s.split(" ");
        boolean isFound = false ;
        for(String words : word){
            if(words.equals(t)){
                isFound=true;
            }
            
        }
        
        return isFound ? "YES" : "NO";
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		String s =sc.nextLine();
		String t = sc.nextLine();
		
		System.out.println(findterm(s,t));

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FTTM)