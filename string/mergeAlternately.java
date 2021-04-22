// 1768. Merge Strings Alternately

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i=0,j=0,n1=word1.length(),n2=word2.length();
        while(i<n1 && j<n2){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i<n1){
            sb.append(word1.charAt(i++));
        }
        while(j<n2){
            sb.append(word2.charAt(j++));

        }
        return sb.toString();
    }
}