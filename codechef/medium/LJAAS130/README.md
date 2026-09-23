# LJAAS130

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Write a program that uses a for-each loop to print the square of each element in an array, but skips elements greater than 10. The elements of the array are  **{2, 10, 12, 6, 15}**.

### Sample 1:
Input
Output

```

```

```
4 100 36
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T07:22:07.347Z  

```java
class Codechef
{
	public static void main (String[] args) 
	{
		int[] values = {2, 10, 12, 6, 15};
        // Complete the code 
         for(int i =0; i<values.length;i++){
             if(values[i]<=10){
                 System.out.print(values[i]*values[i] +" ");
             }
         }   
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS130)