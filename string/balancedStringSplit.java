// 1221. Split a String in Balanced Strings

class Solution {
    public int balancedStringSplit(String s) {
        int left=0,right=0,res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L')
                left++;
            else
                right++;
            if(left==right)
                res++;
        }
        return res;
    }
}