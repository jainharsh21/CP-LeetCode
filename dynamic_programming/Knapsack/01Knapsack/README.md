# 0-1 Knapsack

## Problems
1) Subset Sum
2) Equal Sum Partition
3) Count Of Subset Sum
4) Minimum Subset Sum Diff.
5) Target Sum
6) # Of Subset With Given Difference

## Recursive Function
int knapsack(int wt[],int val[],int W,int n){
    Base Condition
    Choice Diagram
}

### Base Condition
Don't check the base condition by running the recursive function
Instead think of the smallest valid I/P

-> if(n==0 || w==0)
    return 0
   
#### Note : In a recursive function the input should keep getting smaller


### Choice Diagram

![image](https://user-images.githubusercontent.com/44740658/109932478-41087280-7cf0-11eb-997d-53b53a5660de.png)


if(wt[n-1]<=W){
    include : return max(val[n-1] +  knapsack(wt,val,W-wt[n-1],n-1),knapsack(wt,val,W,n-1))
} 

else if(wt[n-1]>W)
    return knapsack(wt,val,W,n-1)

### Recursive Final Code
![image](https://user-images.githubusercontent.com/44740658/109932980-eae7ff00-7cf0-11eb-99b7-f7e74203de68.png)
