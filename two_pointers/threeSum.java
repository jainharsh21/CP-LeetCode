// 15. 3Sum

// create a set...for loop from start to end...and while loop for two pointers.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i=0; i< nums.length-1 ; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end){
                int sum = nums[i] + nums[start]+ nums[end];
                if ( sum == 0)
                set.add(Arrays.asList(nums[i],nums[start++], nums[end--]));
                else if (sum > 0)
                end --;
                else if (sum < 0)
                start ++;
            }      
        }
        return new ArrayList(set);
    }
}
