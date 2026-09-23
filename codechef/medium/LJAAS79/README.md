# LJAAS79

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Create a program that takes a lowercase English alphabetic character as input and uses a  **switch**  statement to determine if it's a  **vowel**  or  **consonant**.

### Sample 1:
Input
Output

```
i
```

```
Vowel
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T07:08:30.122Z  

```java
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{    
	    
	    Scanner sc =new Scanner(System.in);
		// your code goes here
         char input = sc.next().charAt(0);
         
         char lower = Character.toLowerCase(input);
         
         switch(lower){
             case 'a':
             case 'e':
             case 'i':
             case 'o':
             case 'u':
                 System.out.println("Vowel");
                 break;
             default:
                 System.out.println("Consonant");
                 
            
         }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS79)