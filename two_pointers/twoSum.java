// #167 Two Sum II - Input array is sorted
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int[] result = new int[2];
        while(i<j){
            if(numbers[i]+numbers[j]>target){
                j--;
            }else if(numbers[i]+numbers[j]<target){
                i++;
            }else{
                result[0] = i+1;
                result[1] = j+1;
                break;
            }
        }
        return result;
    }
}