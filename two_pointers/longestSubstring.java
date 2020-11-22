// 3. Longest Substring Without Repeating Characters

// create a set...two loops..if doesnt contains add to set and update val of max if not reset the set and break.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));
                    max = Math.max(max, set.size());
                } else {
                    set = new HashSet<>();
                    break;
                }
            }
        }
        return max;
    }
}