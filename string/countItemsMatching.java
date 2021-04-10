// 1773. Count Items Matching a Rule

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        int index = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;
        for(List S : items){
            if(S.get(index).equals(ruleValue))
                res++;
            }
        return res;
    }
}