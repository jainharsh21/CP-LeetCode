class Solution {
    public int integerBreak(int n) {
        int arr[] = new int[n-1];
        for(int i=1;i<n;i++){
            arr[i-1] = i;
        }
        int dp[][] = new int[arr.length+1][n+1];
        for(int i=0;i<=arr.length;i++){
            dp[i][0] = 1;
        }
        for(int i=1;i<=n;i++){
            dp[0][i] = 0;
        }
        for(int i=1;i<=arr.length;i++){
            for(int j=1;j<=n;j++){
                if(arr[i-1]<=j){
                    dp[i][j] = Integer.max(arr[i-1]*dp[i][j-arr[i-1]],dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[arr.length][n];
    }
}