// 763. Partition Labels

class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> res = new ArrayList();
        int[] map = new int[26];  
        // get lastindex of each character in string
        for(int i = 0; i < S.length(); i++){
            map[S.charAt(i)-'a'] = i;
        }
        int last = 0;
        int start = 0;
        for(int i = 0; i < S.length(); i++){
            last = Math.max(last, map[S.charAt(i)-'a']);
            if(last == i){
                res.add(last - start + 1);
                start = last + 1;
            }
        }
        return res;
    }
}