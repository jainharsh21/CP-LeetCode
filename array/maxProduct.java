// 1464. Maximum Product of Two Elements in an Array

class Solution {
    public int maxProduct(int[] nums) {
        int m=0,n=0;
        for(int x:nums){
            if(x>m){
                n=m;
                m=x;
            }else if(x>n){
                n=x;
            }
        }
        return (m-1)*(n-1);
    }
}