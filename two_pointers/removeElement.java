// #27 Remove element 
// two pointers at start...if ele is not equal to val push it and increment i
class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j;
        for(j=0;j<nums.length;j++){
            if(nums[j]!=val)
            {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}