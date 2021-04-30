// 1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 1; i <= words.length; ++i) {
            if (words[i - 1].startsWith(searchWord)) {
                return i;
            }
        }
        return -1;
    }
}