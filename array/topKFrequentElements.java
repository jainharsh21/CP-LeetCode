// 347. Top K Frequent Elements

// code works for only whole numbers
class Solution {
    static final int ASCII_SIZE = 256;
    static char getMaxOccuringChar(String str)
    {
        int count[] = new int[ASCII_SIZE];
        int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++;
      
        int max = -1; 
        char result = ' ';
      
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }
    
    int[] maxOccuringChar(String nums,int k){
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            char n = getMaxOccuringChar(nums);
            String nu = String.valueOf(n);
            int num = Integer.parseInt(nu);
            res[i] = num;
            nums = nums.replaceAll(nu,"");
        }
        return res;
    }
    public int[] topKFrequent(int[] nums, int k) {
        String numss = "";
        for(int n : nums){
            numss+=String.valueOf(n);
        }
        return maxOccuringChar(numss,k);
    }
}