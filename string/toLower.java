// 709. To Lower Case

class Solution {
    public String toLowerCase(String str) {
        String res = "";
        for(char c:str.toCharArray()){
            if(c>=65 && c<97){
                res+= Character.toString(c+32);
            }else{
                res+= String.valueOf(c);
            }
        }
        return res;
    }
}