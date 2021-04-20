// 1832. Check if the Sentence Is Pangram

class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Integer> alphabet = new HashSet<>();
        int count =0;
        for(char c : sentence.toCharArray()){
            if(alphabet.add(c-'a')){
                count++;
            };
            if(count==26)
                return true;
        }
        return false;
    }
}