// 349 Intersection of two arrays
// create two sets...first array direct into set..if set contains element from num2 add it into intersect...convert it into array and return

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> intersect = new HashSet<Integer>();
        int i=0;
        for(i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            if(set.contains(nums2[j])){
                intersect.add(nums2[j]);
            }
        }
        i=0;
        int[] output = new int[intersect.size()];
        for(Integer num:intersect){
            output[i++] = num;
        }
        return output;
    }
}