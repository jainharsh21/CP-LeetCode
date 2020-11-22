// 3. Longest Substring Without Repeating Characters

// create a set...two loops..if doesnt contains add to set and update val of max if not reset the set and break.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> sset = new HashSet<>();
        int max = 0;
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (!sset.contains(s.charAt(j))) {
                    sset.add(s.charAt(j));
                    max = Math.max(max, sset.size());
                } else {
                    sset = new HashSet<>();
                    break;
                }
            }
        }
        return max;
    }
}