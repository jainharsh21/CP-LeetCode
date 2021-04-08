class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i=left;i<=right;i++){
            int temp = i;
            int count = 0;
            while(temp!=0){
               int d = temp % 10;
               if(d==0)
                    break;
               if(i%d==0)
                   count ++;
               temp = temp/10;
            }
            if(count==String.valueOf(i).length())
                res.add(i);
        }
        return res;
    }
}