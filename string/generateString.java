// 1374. Generate a String With Characters That Have Odd Counts

class Solution {
    public String generateTheString(int n) {
        if(n%2!=0)
            return "a".repeat(n);
        return "a".repeat(n-1) + "b";
    }
}