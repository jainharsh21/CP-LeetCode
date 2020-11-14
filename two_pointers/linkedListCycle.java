// 141 Linked List Cycle
// two pointers...if there is a cycle both pointers would meet....if they meet cycle exists.

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode i = head;
        ListNode j = head;
        while(j.next!=null && j.next.next!=null){
            i=i.next;
            j=j.next.next;
            if(i==j) return true;
        }
        return false;   
    }
}