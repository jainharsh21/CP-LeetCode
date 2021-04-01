class Solution {
    public int countSubsetSum(int[] nums,int n,int sum){
        int[][] dp = new int[n+1][sum+1];
        for(int i=0;i<=sum;i++){
            dp[0][i] = 0;
        }
        for(int i = 0; i<=n;i++){
            dp[i][0] = 1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(nums[i-1]<=j && nums[i-1]!=0){
                    dp[i][j] = dp[i-1][j-nums[i-1]] + dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    public int findTargetSumWays(int[] nums, int S) {
        int sum =0,ct=0;
        for(int i:nums){
            if(i==0)
                ct+=1;
            sum+= i;
            
        }
        if((sum+S)%2!=0 || sum<S)
            return 0;
        int s1 = (sum+S)/2;
        return (int) Math.pow(2,ct) * countSubsetSum(nums,nums.length,s1);
    }
}