// 234. Palindrome Linked List

// convert linked list to array and then check for palindrome

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next == null) return true;
        ListNode j = head;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i=0;
        while(j!=null){
            arr.add(j.val);
            j = j.next;
        }
        int[] a = new int[arr.size()];
        for(Integer num:arr){
            a[i++] = num;
        }
        i = 0;
        int k = a.length - 1;
        while(i<k){
            if(a[i]!=a[k])
                return false;
            else{
                i++;
                k--;
            }
        }
        return true;
    }
}