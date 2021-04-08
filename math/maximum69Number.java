// 1323. Maximum 69 Number

class Solution {
    public int maximum69Number (int num) {
        String numb = String.valueOf(num);
        for(int i=0;i<numb.length();i++){
            if(numb.charAt(i)=='6'){
                StringBuilder string = new StringBuilder(numb);
                string.setCharAt(i,'9');
                numb = string.toString();
                break;
            }
        }
        return Integer.parseInt(numb);
    }
}

// one line solution but slow

class Solution {
    public int maximum69Number (int num) {
        return Integer.parseInt(String.valueOf(num).replaceFirst("6","9"));
    }
}