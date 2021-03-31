# Unbounded Knapsack

The main difference between unbounded and 01 knapsack is that multiple occurences of same item is allowed.
Although if we reject it once...we can process it again

```
int unboundedKnapsack(int wt[],int val[],int W,int n)
{
    if(W==0 || n==0)
        return 0
    else if(wt[n-1]<=W){
        return max(val[n-1]+unboundedKanpsack(wt,val,W-wt[n-1],n),unboundedKanpsack(wt,val,W,n-1));
    }
    else
        return unboundedKnapsack(wt,val,W,n-1);
}
```