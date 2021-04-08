// 942. DI String Match

class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length(),left=0,right=n;
        int[] arr = new int[n+1];
        for(int i=0;i<n;i++){
            arr[i] = s.charAt(i)=='I' ? left++ : right--;
        }
        arr[n] = left;
        return arr;
    }
}