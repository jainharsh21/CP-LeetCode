// init of the all columns of first row would be on max value -1 int(because it takes infinite coins to make amount 0,-1 because we have to add + 1 when we select it...max+1 would give us a negative number)
// also we would add 1 when we choose a coin..because it increases the number of coin chosen by 1.
class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][] = new int[coins.length+1][amount+1];
        for(int i=1;i<=coins.length;i++){
            dp[i][0] = 0;
        }
        for(int i=0;i<=amount;i++){
            dp[0][i] = Integer.MAX_VALUE-1;
        }
        for(int i=1;i<=coins.length;i++){
            for(int j=1;j<=amount;j++){
                if(coins[i-1]<=j){
                    dp[i][j] = (int) Math.min(dp[i][j-coins[i-1]]+1,dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[coins.length][amount]==Integer.MAX_VALUE-1 ? -1 : dp[coins.length][amount];
    }
}