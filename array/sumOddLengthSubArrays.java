// 1588. Sum of All Odd Length Subarrays

// Bruteforce

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int res = 0;
        for (int window = 1; window <= arr.length; window += 2)
		    for (int i = 0; i + window <= arr.length; i++)
			    for (int j = i; j < i + window; j++)
				    res += arr[j];
	    return res;
    }
}
