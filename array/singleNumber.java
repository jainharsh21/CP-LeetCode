// 136. Single Number

// Bruteforce(view bit manipulation folder for a better solution)
class Solution {
    int countOccurence(int[] arr,int n){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n)
                count++;
        }
        return count;
    }
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(countOccurence(nums,nums[i])==1)
                return nums[i];
        }
        return -1;
    }
}