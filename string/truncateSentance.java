// 1816. Truncate Sentence

// using split
class Solution {
    public String truncateSentence(String s, int k) {
        String[] split = s.split(" ");
        String res = "";
        for(int i=0;i<k-1;i++){
            res += split[i] + " ";
        }
        return res+=split[k-1];
    }
}

// without split
 public String truncateSentence(String s, int k) {
        int idx=0;
        int spaceCount=0;
        
        while(idx<s.length() && spaceCount<k){
            if(s.charAt(idx)==' ') spaceCount++;
            idx++;
        }
        // if(spaceCount<k) means we have to include whole string 
        return spaceCount==k?s.substring(0,idx-1):s;
    }