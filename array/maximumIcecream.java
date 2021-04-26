// 1833. Maximum Ice Cream Bars

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int res=0;
        for(int num :costs){
            if(num<=coins){
                res++;
                coins = coins-num;
            }
        }
        return res;
    }
}