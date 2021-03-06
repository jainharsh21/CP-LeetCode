# Minimum Subset Sum Difference

In this problem we have to find out two subsets such that the absolute differnce of their sum is minimum

This is kinda related to the equal partition(since both equal then diff would be 0-> hence minimum)

We find the range of S1 and S2 since we can't find the exact values of them(from 0 to sum of the array)

If we find one partition the other partition would be range - first partition

First subset would be on the left side of the partition...so s1 < s2 and
we have to find s2-s1 which would be Range - s1 - s1 -> Range - 2s1

now s1 would be less than range/2 and we can eliminate the ones whose sum doesnt exist(to eliminate we would use the subset sum to check if exists or not)

then make a vector consisting of the elements which are remaining and then execture the following code

![image](https://user-images.githubusercontent.com/44740658/110172218-d146d480-7e22-11eb-91f0-ccdea7480417.png)


