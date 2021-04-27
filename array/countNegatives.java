// 1351. Count Negative Numbers in a Sorted Matrix

// Bruteforce
class Solution {
    public int countNegatives(int[][] grid) {
        int res=0;
        for(int[] nums: grid){
            for(int num:nums){
                if(num<0)
                    res++;
            }
        }
        return res;
    }
}