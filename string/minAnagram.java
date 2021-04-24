// 1347. Minimum Number of Steps to Make Two Strings Anagram

class Solution {
    public int minSteps(String s, String t) {
        int[] count = new int[26];
        int ans = 0,n=s.length();
        for(int i=0;i<n;i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int i:count) if(i> 0) ans += i;
        return ans;
    }
}