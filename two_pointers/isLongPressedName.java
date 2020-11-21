// 925 Long Pressed Name

// two pointers....a loop for typed...if both character matches move first pointer...if not check whether it is the start..if it is return false or check whether the last char is the same char(long pressed key) if not return false...in the end check whether i has traversed the whole name...i.e i == name.length()   
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0,j=0;
        for(j=0;j<typed.length();j++){
            if(i<name.length() && name.charAt(i) == typed.charAt(j))
                i++;
            else if(j==0 || typed.charAt(j)!=typed.charAt(j-1))
                   return false;
        }
        return i==name.length();
    }
}