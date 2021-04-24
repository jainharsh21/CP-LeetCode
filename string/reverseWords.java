// 557. Reverse Words in a String III

class Solution {
    String reverse(String s){
        StringBuilder res = new StringBuilder();
        return res.append(s).reverse().toString();
    }
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String str : arr){
            res.append(reverse(str) + " ");
        }
        return res.toString().trim();
    }
}