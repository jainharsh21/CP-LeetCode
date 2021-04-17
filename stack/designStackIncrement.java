// 1381. Design a Stack With Increment Operation

class CustomStack {
    int[] stack;
    int size;
    int top;

    public CustomStack(int maxSize) {
        this.stack = new int[maxSize+1];  
        this.size = maxSize;
        this.top = -1;
    }
    
    public void push(int x) {
            if(top+1 < size)
                stack[++top] = x;
        
    }
    
    public int pop() {
        if(top>-1){
            return stack[top--];
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        for (int i=0;i<Math.min(k, top+1);i++) {
            stack[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */