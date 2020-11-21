// 844. Backspace String Compare

// func to generate string from StringBuilder after backspacing...and then check equals and return.

class Solution {
    public boolean backspaceCompare(String S, String T) {
        
        return genString(new StringBuilder(S)).equals(genString(new StringBuilder(T)));
    }
    
    private String genString(StringBuilder s)
    {
        int i = 0;
        
        while (i < s.length())
        {
            if (s.charAt(i) == '#')
            {
                s.deleteCharAt(i);
                
                if (i-1 >= 0)
                {
                    s.deleteCharAt(i-1);
                    i--;
                }
            }
            else
                i++;
        }
        
        return s.toString();
    }
}