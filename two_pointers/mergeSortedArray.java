// #88 Merge Sorted Array
// initialize to pointers at the end of A and B...whlie they are less than 0...compare and push...if elements are left...push them again.
class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        int i=m-1;
		int j=n-1;
		int k = m+n-1;
		while(i >=0 && j>=0)
		{
			if(A[i] > B[j])
				A[k--] = A[i--];
			else
				A[k--] = B[j--];
		}
		while(j>=0)
			A[k--] = B[j--];
    }
}