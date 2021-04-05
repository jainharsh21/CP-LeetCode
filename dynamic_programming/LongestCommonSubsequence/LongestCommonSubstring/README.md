# Longest Common Substring

Here we have to find the length of the longest substring instead of the sequence
The difference is in sequence we are allowed to skip some chars and go to the next ones...but in case of substring it has to be continous
So, the moment there is no match , we reset the length to 0

Initialization is same

```
    int result = 0
    if(x[i-1]==y[j-1]){
        t[i][j] = 1 + t[i-1][j-1]
        result = Integer.max(result, LCS[i][j]);
    }
    else
        t[i][j] = 0

    return result;
```