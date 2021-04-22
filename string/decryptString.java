// 1309. Decrypt String from Alphabet to Integer Mapping

class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(i<n-2 && s.charAt(i+2)=='#'){
                sb.append((char) ((Integer.parseInt(s.substring(i, i+2)) - 1)+ 'a') );
                i=i+2;
            }
            else
                sb.append((char) ((Integer.parseInt(s.substring(i,i+1)) - 1)+ 'a') );
        }
        return sb.toString();
    }
}