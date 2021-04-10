// 1614. Maximum Nesting Depth of the Parentheses

class Solution {
    public int maxDepth(String s) {
        int res = 0,cur=0;
        int index = s.lastIndexOf('(');
        for(int i=0;i<=index;i++){
            if(s.charAt(i)=='('){
                res = Math.max(res,++cur);
            }else if(s.charAt(i)==')'){
                cur--;
            }
        }
        return res;
    }
}