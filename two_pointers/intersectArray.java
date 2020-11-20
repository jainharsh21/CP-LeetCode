// 350 Intersection of Two Arrays II
// sort both arrays...two pointers...move to intersection..and add to array list..convert to list and return.
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j])
            {
                j++;
            }
            else
            {
                intersection.add(nums1[i]);
                i++;
                j++;
            }
        }
        i=0;
        int[] ret = new int[intersection.size()];
        for(Integer num:intersection){
            ret[i++] = num;
        }
        return ret;
    }
}