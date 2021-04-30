// 1332. Remove Palindromic Subsequences

// if striing is empty then return 0...if it is a palindrome we can remove it in 1 step...if its not then in step 1 we'll remove all a's and in second we'll remove all b's...so minimum 2 steps

class Solution {
    public int removePalindromeSub(String s) {
        return s.isEmpty() ? 0 : (s.equals(new StringBuilder(s).reverse().toString()) ? 1:2);
    }
}