// 1342. Number of Steps to Reduce a Number to Zero

class Solution {
    boolean isEven(int n){
        return n%2==0;
    }
    public int numberOfSteps(int num) {
        int res = 0; 
        while(num!=0){
            num = isEven(num) ? num/2 : num-1; 
            res++;
        }
        return res;
    }
}