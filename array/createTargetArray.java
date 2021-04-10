// 1389. Create Target Array in the Given Order

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            int idx = index[i];
            // if index is less than i...meaning already filled...then shift elements to right
            if(idx < i)
            {
                for(int j = i; j > idx; j--)
                    res[j] = res[j-1];
            } 
            // else insert the element on the given index
            res[idx] = nums[i];
        }
        return res;
    }
}