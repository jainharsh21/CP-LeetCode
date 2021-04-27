// 1304. Find N Unique Integers Sum up to Zero

class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int left = 0, right = n - 1, start = 1;
        while (left < right) {
            res[left++] = -start;
            res[right--] = +start;
            start++;
        }
        return res;
    }
}