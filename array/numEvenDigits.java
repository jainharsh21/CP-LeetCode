// 1295. Find Numbers with Even Number of Digits

class Solution {
    boolean isEvenDigit(int n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count%2==0;
    }
    public int findNumbers(int[] nums) {
        int res=0;
        for(int n:nums){
            if(isEvenDigit(n)){
                res++;
            }
        }
        return res;
    }
}