# 0-1 Knapsack

## Problems
1) Subset Sum
2) Equal Sum Partition
3) Count Of Subset Sum
4) Minimum Subset Sum Diff.
5) Target Sum
6) Number Of Subset With Given Difference

## Recursive Function
int knapsack(int wt[],int val[],int W,int n){
    Base Condition
    Choice Diagram
}

### Base Condition
Don't check the base condition by running the recursive function
Instead think of the smallest valid I/P

->
```
 if(n==0 || w==0)
    return 0
```
   
#### Note : In a recursive function the input should keep getting smaller


### Choice Diagram

![image](https://user-images.githubusercontent.com/44740658/109932478-41087280-7cf0-11eb-997d-53b53a5660de.png)

```
if(wt[n-1]<=W){
    include : return max(val[n-1] +  knapsack(wt,val,W-wt[n-1],n-1),knapsack(wt,val,W,n-1))
} 

else if(wt[n-1]>W)
    return knapsack(wt,val,W,n-1)
```

### Recursive Final Code
![image](https://user-images.githubusercontent.com/44740658/109932980-eae7ff00-7cf0-11eb-99b7-f7e74203de68.png)

## Memoization

It is an alternative for top-down approach(tabular)

Adding two lines to the recursive code memoizes it

First create a matrix of dimension mxn where m and n would be the parameters that are going to change in recursive function(W and n in this case)

Then fill the whole matrix with -1

Before calling recursive function check if the value is -1 and if there is a value then return it(using memset() in C)

#### Note for java to initialize a matrix with a number(1 in this case) 

```
int[][] arr2 = new int[5][5];  
for(int[] arr1 : arr2) 
  Arrays.fill(arr1, 1);
```

### Code After Memoization(additional code in blue)

![image](https://user-images.githubusercontent.com/44740658/109938148-b591e000-7cf5-11eb-8e10-f7a754e97fdc.png)

## Bottom Up Approach

In bottom up approach(or tabulation) we don't use recursive calls
It is better than recursion(not much difference tbh) as it avoids stack overlfow(rare chances)(scambled string -> error)

To fill the table there are two steps
1) Initialization
2) Convert recursive function to iterative

The whole matrix is filled with subproblems...the last cell in the matrix is the solution of the main problem

The first row and column are reserved for initialization...so the actual contents are mapped from the next row-column

Initialization is necessary because we are converting the recursive function to iterative and the base condition is what is used in initialization


### Converting the base condition to initialization
![image](https://user-images.githubusercontent.com/44740658/110019163-21079c00-7d4e-11eb-8d3e-2fabf5ef6123.png)

### Iterative code for the choice diagram
![image](https://user-images.githubusercontent.com/44740658/110022088-8610c100-7d51-11eb-8c52-1d0ad58bc7a8.png)

### Summed Up Code
![image](https://user-images.githubusercontent.com/44740658/110022525-07685380-7d52-11eb-9b39-536ea661066e.png)


