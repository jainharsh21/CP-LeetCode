// 1672. Richest Customer Wealth

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] arr : accounts){
            int temp=0;
            for(int num : arr){
                temp += num;
            }
            max = max>temp ? max : temp;
        }
        return max;
    }
}