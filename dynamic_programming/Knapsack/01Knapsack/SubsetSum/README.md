# Subset Sum

Subset Sum is a DP problem which is solved using 0-1 Knapsack

In subset sum we are given an array of elements and a sum(any random value) and the goal is to find whether there is a subset(if there is,in some case we'll have to print it) or not

Initialization

init an array of dimensions n+1 and sum+1(w)

### Matrix Initialization
![image](https://user-images.githubusercontent.com/44740658/110034625-b1e77300-7d60-11eb-92b6-cf5185833995.png)


```
for(---)
    for(---)
        if(i==0)
            t[i][j] = False
        if(j==0)
            t[i][j] = True
```

map the given array to weight array
sum to the weight variable
ignore value array for now

incase of boolean expressions the max function acts as a logical OR

### Code comparison with knapsack
![image](https://user-images.githubusercontent.com/44740658/110035899-3f779280-7d62-11eb-86c0-5cbda3695a9e.png)

In the end return t[n][sum]
