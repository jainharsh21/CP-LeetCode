class Solution {
    
    public boolean minimumSubsetSumDifference(int num[],int n,int sum){
        int sum=0,min=Integer.MAX_VALUE;
        for(int n:nums)
        {
            sum += n;
        }
        boolean[][] dp = new boolean[n+1][sum+1];
        for (int i = 0; i <= sum; i++)
            dp[0][i] = false;
        for(int i = 0; i<=n;i++){
            dp[i][0] = true;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(num[i-1]<=j){
                    dp[i][j] = dp[i-1][j-num[i-1]] || dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        for(int j=0;j<=sum/2;j++){
            if(dp[n-1][j]){
                min = Math.min(min,sum-2*j);
            }
        }
    }
}