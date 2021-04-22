// 1732. Find the Highest Altitude

class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length+1];
        arr[0] = 0;
        for(int i=1;i<arr.length;i++){
            arr[i] = gain[i-1] + arr[i-1];
        }
        int res = 0;
        for(int n:arr){
            if(n>res)
                res = n;
        }
        return res;
    }
}