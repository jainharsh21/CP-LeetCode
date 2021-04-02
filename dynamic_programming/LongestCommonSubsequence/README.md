# Longest Common Subsequence(LCS)

## Problems
![image](https://user-images.githubusercontent.com/44740658/113380498-06026900-939a-11eb-88e6-b12330ce51d9.png)

## Recursion

### Base Condition

First we'll check for the base condition,which would be the length of the either or both strings is 0 and hence the LCS would be 0 too

```
    if(m==0 || n==0)
        return 0
```

### Choice Diagram

Here,we'll check if both last characters match...if they do reduce both strings by 1...if they don't then we have two choices...either we can reduce 1st string by 1 or the other one...to decide this we'll use max since we need to find "longest" commone subsequence

![image](https://user-images.githubusercontent.com/44740658/113384821-86c66280-93a4-11eb-867c-286f74423955.png)

```
    if(s1[m-1]==s2[n-1])
        return 1+lcs(s1,s2,m-1,n-1)
    else
        return max(lcs(s1,s2,m-1,n),lcs(s1,s2,m,n-1))
```

## Code
![image](https://user-images.githubusercontent.com/44740658/113385066-f6d4e880-93a4-11eb-8fc0-936f4e509b14.png)
