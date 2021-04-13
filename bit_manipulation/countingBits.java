// 338. Counting Bits

class Solution {
    int countSetBits(int n)
    {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        for(int i=0;i<=num;i++){
            res[i] = countSetBits(i);
        }
        return res;
    }
}