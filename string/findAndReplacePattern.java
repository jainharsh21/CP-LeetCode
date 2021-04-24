// 890. Find and Replace Pattern

class Solution {
    String getPattern(String s){
        HashMap<Character,Integer> set = new HashMap<>();
        String res = "";
        int i=0;
        for(char ch : s.toCharArray()){
            if(!set.containsKey(ch)){
                set.put(ch,i++);
            }
            res += set.get(ch);
        }
        return res;
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        String patt = getPattern(pattern);
        for(String s : words){
            String str = getPattern(s);
            if(str.equals(patt)) res.add(s);
        }
        return res;
    }
}
