// 1281. Subtract the Product and Sum of Digits of an Integer

class Solution {
    public int subtractProductAndSum(int n) {
        int product=1,sum=0,d=0;
        while(n!=0){
            d= n%10;
            product *= d;
            sum += d;
            n = n/10;
        }
        return product-sum;
    }
}