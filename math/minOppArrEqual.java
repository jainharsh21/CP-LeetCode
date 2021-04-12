// 1551. Minimum Operations to Make Array Equal

// Bruteforce

class Solution {
    public int minOperations(int n) {
        int[] arr = new int[n];
        int res = 0;
        for(int i=0;i<n;i++){
            arr[i] = 2*i + 1;
        }
        int sum = 0;
        for(int N : arr)
            sum+= N;
        int avg = sum/n;
        for(int i=0;i<arr.length/2;i++){
            res += avg - arr[i] ;
        }
        return res;
    }
}

// using ap

// find sum of first n/2 numbers

// check if n is odd or even

class Solution {
    public int minOperations(int n) {
        if(n%2==1){
            n/=2;
            return (n*(n+1));
        }        
        n/=2;
        return n*n;
    }
}
