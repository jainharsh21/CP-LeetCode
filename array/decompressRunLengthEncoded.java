class Solution {
    public int[] decompressRLElist(int[] nums) {
        // get the size of the new array
        int arrSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arrSize += nums[i];
        }
        int[] result = new int[arrSize];
        int startIdx = 0;
        for (int i = 0; i < nums.length; i += 2) {
            // fill array by passing result array,starting index,ending index,and value respectively.
            Arrays.fill(result, startIdx, startIdx + nums[i], nums[i + 1]);
            startIdx += nums[i];
        }
        return result;
    }
}
