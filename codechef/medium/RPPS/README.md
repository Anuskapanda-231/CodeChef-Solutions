# RPPS

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Repeating Pairs

You are given a string $S$ consisting of lowercase English letters.

For every two adjacent characters in $S$, consider the pair they form. For example, the string `abca` contains the pairs `ab`, `bc`, and `ca`.

A pair is called  **repeating**  if it appears at least twice in the string.

Find the  **number of distinct repeating pairs**  in $S$.

For example, in `ababcabc`, the pair `ab` appears $3$ times and `bc` appears $2$ times, so the answer is $2$.

### Input Format
- The first line contains the string $S$.
### Output Format
- Print a single integer — the number of distinct consecutive character pairs that appear more than once.
### Constraints
- $1 \le |S| \le 10^5$
- $S$ consists only of lowercase English letters.
### Sample 1:
Input
Output

```
ababcabc
```

```
2
```

### Explanation:

The consecutive pairs are:

`ab`, `ba`, `ab`, `bc`, `ca`, `ab`, `bc`

The pair `ab` appears $3$ times and `bc` appears $2$ times.

Therefore, there are  **2**  distinct repeating pairs.

### Sample 2:
Input
Output

```
aaaa
```

```
1
```

### Explanation:

The consecutive pairs are:

`aa`, `aa`, `aa`

Only the pair `aa` appears more than once.

Therefore, the answer is  **1**.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T06:29:19.706Z  

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

[View on CodeChef](https://www.codechef.com/problems/RPPS)