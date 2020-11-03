// #26 Remove duplicates from sorted array
// pointers next to each other...if element not same increment i and push.
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
