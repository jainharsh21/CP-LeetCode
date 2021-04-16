// 739. Daily Temperatures

// Bruteforce

class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];
        for(int i=0;i<T.length;i++){
            int count=0;
            for(int j=i+1;j<T.length;j++){
                if(T[j]>T[i]){
                    res[i] = ++count;
                    break;
                }else{
                    count++;
                }
            }
        }
        return res;
    }
}

// Using Stack(array)

public int[] dailyTemperatures(int[] temperatures) {
    int[] stack = new int[temperatures.length];
    int top = -1;
    int[] ret = new int[temperatures.length];
    for(int i = 0; i < temperatures.length; i++) {
        while(top > -1 && temperatures[i] > temperatures[stack[top]]) {
            int idx = stack[top--];
            ret[idx] = i - idx;
        }
        stack[++top] = i;
    }
    return ret;
}