// 1486. XOR Operation in an Array

class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        int res = 0;
        for(int i=0;i<n;i++){
            nums[i] = start + 2*i;
        }
        for(int N:nums){
            res ^= N;
        }
        return res;
    }
}