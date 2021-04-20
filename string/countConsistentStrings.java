// 1684. Count the Number of Consistent Strings

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> all = new HashSet();
        for(char c : allowed.toCharArray())
            all.add(c);
        int res=0;
        int count = 0;
        for(String s:words){
            count = 0;
            for(char c : s.toCharArray()){
                if(all.contains(c))
                    count++;
            }
            if(count==s.length())
                res++;                
        }
        return res;
    }
}