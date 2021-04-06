# Shortest Common Supersequence

Given two strings,merge them in such a way such that the resulting string would have both the strings as substrings...also find such shortest merged string(supersequence)

Worst case would be if we directly add both the strings->so length would be len(a) + len(b)
But instead of adding both the strings directly we can eliminate the LCS in them...so...-> len(a)+len(b)-LCS would be the final answer

## Solution
![image](https://user-images.githubusercontent.com/44740658/113664844-1bdd9a00-96ca-11eb-85ab-4f0968c88734.png)
