# MFRLE

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Most Frequent Letter

You are given a string $S$ containing uppercase and lowercase English letters, digits, spaces, and special characters.

Only the  **alphabetic characters**  in the string are considered. Letter case is ignored, so uppercase and lowercase forms of the same letter are treated as equal. For example, `A` and `a` represent the same letter.

Find the letter that appears most frequently in $S$.

If multiple letters have the same maximum frequency, choose the one that comes  **first alphabetically**.

Print the answer as a lowercase letter.

### Input Format
- The first line contains the string $S$.
### Output Format
- Print a single lowercase letter — the most frequent alphabetic character in $S$.
### Constraints
- $1 \le |S| \le 10^5$
- $S$ may contain uppercase and lowercase English letters, digits, spaces, and special characters.
- $S$ contains at least one English alphabetic character.
### Sample 1:
Input
Output

```
Hello, World! 123
```

```
l
```

### Explanation:

Ignoring non-alphabetic characters and letter case, the string becomes `helloworld`.

The letter `l` appears $3$ times, which is more than any other letter.

Therefore, the answer is `l`.

### Sample 2:
Input
Output

```
zzYYxx
```

```
x
```

### Explanation:

After ignoring case, the letters `x`, `y`, and `z` each appear $2$ times.

Since `x` comes first alphabetically, the answer is `x`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T12:38:17.986Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{   
    
    
    public static char getmostfreqletter(String s){
        
        int[] freq = new int[26];
        
        for(int i=0;i<s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));
            
            if(Character.isLetter(ch)){
                freq[ch-'a']++;
            }
        }
        
        int maxval=0;
        char answer ='a';
        for(int i=0;i<26;i++){
            if(freq[i]>maxval){
                maxval=freq[i];
                answer =(char) (i +'a');
            }
        }
        return answer;
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println(getmostfreqletter(s));

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MFRLE)