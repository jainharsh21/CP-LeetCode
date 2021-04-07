class Solution {
    public int longestPalindromeSubseq(String s1) {
        int m = s1.length();
        StringBuilder s = new StringBuilder();
        s.append(s1);
        String s2 = s.reverse().toString();
        int n = s2.length();
        int dp[][] = new int[m+1][n+1];
        for(int i=0;i<=m;i++)
            for(int j=0;j<=n;j++)
                if(i==0 || j==0)
                    dp[i][j] = 0;
        for(int i=1;i<=m;i++)
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j] = 1+dp[i-1][j-1];
                else
                    dp[i][j] = Integer.max(dp[i-1][j],dp[i][j-1]);
            }
        return dp[m][n];
    }
}