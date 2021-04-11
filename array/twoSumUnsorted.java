// 1. Two Sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=nums.length-1;
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);
        int[] res = new int[2];
        while (i<j){
            if(copy[i]+copy[j]==target){
                res[0] = copy[i];
                res[1] = copy[j];
                break;
            }
            else if(copy[i] + copy[j]>target)
                j--;
            else
                i++;
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]==res[0]){
                res[0] = i;
                break;               
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]==res[1] && i!=res[0]){
                res[1] = i;
                break;             
            }
        }
        return res;
    }
}

// Map Version
class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < numbers.length; i++) {
        if (map.containsKey(target - numbers[i])) {
            result[1] = i;
            result[0] = map.get(target - numbers[i]);
            return result;
        }
        map.put(numbers[i], i);
    }
    return result;
}
}