// 1662. Check If Two String Arrays are Equivalent

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="",s2="";
        for(String s : word1){
            s1+=s;
        }
        for(String s : word2){
            s2+=s;
        }
        return s1.equals(s2);
    }
}

// 1 liner

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }
}