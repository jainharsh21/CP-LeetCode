// 921. Minimum Add to Make Parentheses Valid

class Solution {
    public int minAddToMakeValid(String S) {
        int unmatchedOpen = 0;
	    int unmatchedClose = 0;
        for(char c : S.toCharArray()){
            if(c=='(')
                unmatchedOpen++;
            else if(unmatchedOpen>0)
                unmatchedOpen--;
            else
                unmatchedClose++;
        }
        return unmatchedOpen+unmatchedClose;
    }
}