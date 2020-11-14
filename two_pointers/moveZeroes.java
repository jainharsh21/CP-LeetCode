// #283 Move Zeroes
// push non-zero numbers to left and zeros to the right.
class Solution {
    public void moveZeroes(int[] nums) {
        int last = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[++last] = nums[i];
                if(i != last)
                    nums[i]=0; 
            }
        }
    }
}