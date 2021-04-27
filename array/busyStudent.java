// 1450. Number of Students Doing Homework at a Given Time

class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int i=0,res=0;
        while(i<startTime.length){
            if(startTime[i]<=queryTime && endTime[i]>=queryTime) res++;
            i++;
        }
        return res;
    }
}