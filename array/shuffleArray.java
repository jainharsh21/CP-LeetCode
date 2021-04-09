// 1470. Shuffle the Array

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int i,j,k;
        for(i=0,j=0,k=nums.length/2;i<nums.length;i=i+2,j++,k++){
            res[i] = nums[j];
            res[i+1] = nums[k];
        }
        return res;
    }
}