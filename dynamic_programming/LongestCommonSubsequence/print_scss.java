class Solution {
    public String shortestCommonSupersequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int dp[][] = new int[m+1][n+1];
        for(int i=0;i<=m;i++)
            for(int j=0;j<=n;j++)
                if(i==0 || j==0)
                    dp[i][j] = 0;
        for(int i=1;i<=m;i++)
            for(int j=1;j<=n;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1))
                    dp[i][j] = 1+dp[i-1][j-1];
                else
                    dp[i][j] = Integer.max(dp[i-1][j],dp[i][j-1]);
            }
        int i=m,j=n;
        StringBuilder res = new StringBuilder();
        while(i>0 && j>0){
            if(text1.charAt(i-1)==text2.charAt(j-1)){
                res.append(text1.charAt(i-1));
                i--;
                j--;
            }else if(dp[i-1][j]>dp[i][j-1]){
                res.append(text1.charAt(i-1));
                i--;
            }else{
                res.append(text2.charAt(j-1));
                j--;
            }
        }
        while(i>0){
            res.append(text1.charAt(i-1));
            i--;
        }
        while(j>0){
            res.append(text2.charAt(j-1));
            j--;
        }
        return res.reverse().toString();
    }
}