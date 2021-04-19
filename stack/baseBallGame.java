// 682. Baseball Game

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack();
        for(int i=0;i<ops.length;i++){
            switch(ops[i]){
                case "C" : 
                    stack.pop();
                    break;
                case "D" :
                    int prev = stack.peek();
                    stack.push(2*prev);
                    break;
                case "+" :
                    int prev1 = stack.pop();
                    int prev2 = stack.pop();
                    stack.push(prev2);
                    stack.push(prev1);
                    stack.push(prev1+prev2);
                    break;
                default : 
                    stack.push(Integer.parseInt(ops[i]));
            }
        }
        int sum = 0;
        while (stack.size() > 0){
            System.out.println(stack.peek());
            sum += stack.pop();
            
        } 
        return sum;
    }
}

// without switch case and calculating sum during operations

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (String s: ops) {
            if (s.equals("D")) {
                stack.push(stack.peek() * 2);
                sum += stack.peek();
            } else if (s.equals("C")) {
                sum -= stack.pop();
            } else if (s.equals("+")) {
                int sec = stack.peek();
                stack.pop();
                int fir = stack.peek();
                int cur = fir + sec;
                stack.push(sec);
                stack.push(cur);
                sum += cur;
            } else {
                stack.push(Integer.parseInt(s));
                sum += stack.peek();
            }
        }
        return sum;
    }
}