class Solution {
    public boolean isVowel(char c)
    {
        if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' ||                c=='u' || c=='U')  
            return true;
        return false;  
    }   
    public String reverseVowels(String s) {
                
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length -1;
        while(i<j){
            while(i<j && !isVowel(chars[i])){
                i++;
            }
            while(i<j && !isVowel(chars[j])){
                j--;
            }

                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
        }
        return new String(chars);
    }
}