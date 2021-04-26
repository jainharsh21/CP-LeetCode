// 1529. Bulb Switcher IV

class Solution {
    public int minFlips(String target) {
        int res=0;
        char prev = '0';
        for(char c:target.toCharArray()){
            if(c!=prev){
                prev=c;
                res++;
            }
        }
        return res;
    }
}