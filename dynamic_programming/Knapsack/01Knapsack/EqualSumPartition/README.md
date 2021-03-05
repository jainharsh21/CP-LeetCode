# Equal Sum Partition

In equal sum partition an array is given and the o/p would be T/F, the goal is to divide the array in two parts such that both parts have the same sum(if there exists such partition then true else false)

Example [1,5,11,5] -> [1,5,5] & [11] -> Both have sum 11

First we'll calculate the sum of the array and check if it is even, if its not then there's no possibility of dividing both arrays in two equal parts(all are integers) and we'll return false

This is related to the subset sum problem as we have to find one subset which has the sum equal to the half of the sum of the array(if we find one the other would be the same as it)

So basically to convert the equal sum partititon to the subset sum problem do the following things
1) Check if the sum of array is even...if its not then terminate by returning false
2) Find if there exists a subset whose sum is equal to the half of the sum of the whole array, if exists return true else return false

### Code
![image](https://user-images.githubusercontent.com/44740658/110094515-ed665980-7dc1-11eb-8576-c2ff994daab2.png)
