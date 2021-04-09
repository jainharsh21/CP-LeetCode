// 1431. Kids With the Greatest Number of Candies

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> res = new ArrayList();
        for(int n:candies){
            max = n>max ? n : max;
        }
        for(int n:candies){
            if(n+extraCandies>=max)
                res.add(true);
            else
                res.add(false);
        }
        return res;
    }
}