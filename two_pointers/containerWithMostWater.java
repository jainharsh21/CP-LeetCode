// 11. Container With Most Water

// one at start...other at end...while loop...check which is shorter height and multiply with width...update area if max...

class Solution {
    public int maxArea(int[] height) {
        int k=0,i=0,j=height.length-1;
        int area=0;
        int shorter = 0;
        while(i<j){ 
            shorter = height[i] > height[j] ? height[j] : height[i];
            area = shorter * (j-i) > area ? shorter * (j-i) : area;
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return area;
    }
}