// 1047. Remove All Adjacent Duplicates In String

class Solution {
    // Using stack logic
    public String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();
        int size = 0;
        for(char c : S.toCharArray()){
            size = sb.length();
            if(size>0 && sb.charAt(size-1)==c){
                sb.deleteCharAt(size-1);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
    // Using two pointers
    public String removeDuplicates(String s) {
        int i = 0, n = s.length();
        char[] res = s.toCharArray();
        for (int j = 0; j < n; ++j, ++i) {
            res[i] = res[j];
            if (i > 0 && res[i - 1] == res[i]) // count = 2
                i -= 2;
        }
        return new String(res, 0, i);
    }
}