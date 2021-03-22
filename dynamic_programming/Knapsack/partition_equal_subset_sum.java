class Solution {
    
    public boolean subsetSum(int num[],int n,int sum){
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
        return dp[n][sum];
    }
    
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int n:nums)
        {
            sum += n;
        }
        if(sum%2!=0)
            return false;
        return subsetSum(nums,nums.length,sum/2);
    }
}