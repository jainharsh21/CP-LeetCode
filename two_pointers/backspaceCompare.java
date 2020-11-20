class Solution {
    public boolean backspaceCompare(String S, String T) {
        int i=0;
        String s1="",s2="";
        for(char c:S.toCharArray()){
            if(c=='#' && s1.length() != 0) s1 = s1.substring(0, s1.length()-1);
            else if(c!='#') s1 += c;
        }
        for(char c:T.toCharArray()){
            if(c=='#' && s2.length() != 0) s2 = s2.substring(0, s2.length()-1);
            else if(c!= '#') s2 += c;
        }
        return s1.equals(s2);
    }
}