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

### Code
![image](https://user-images.githubusercontent.com/44740658/113385066-f6d4e880-93a4-11eb-8fc0-936f4e509b14.png)

## Memoization(Top Down Approach)

In memoization,we store the results that have been calculated from recursive calls,so if they have to be calculated again,we can directly use the previously stored result instead of calculating again...here we have recursion + matrix...so basically memoization helps

### Code
![image](https://user-images.githubusercontent.com/44740658/113387323-b75ccb00-93a9-11eb-8f7a-e517c005ec57.png)

## Bottom Up Approach

### Initialisation

The base code in recursion becomes initialisation in bottom-up approach
Here the first row and column would be initialised to 0


### Choice Diagram

```
    if(x[i-1]==y[j-1])
        t[i][j] = 1 + t[i-1][j-1]
    else
        t[i][j] = max(t[i-1][j],t[i][j-1])
```

### Note
The value in t[i][j] would represent the value of LCS where length of string x is i and string y is j
Hence,the value in t[m][n] would be the final result


