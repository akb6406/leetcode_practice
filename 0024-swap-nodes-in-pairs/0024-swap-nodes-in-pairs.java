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
    public ListNode swapPairs(ListNode head) {
       if(head==null) return null;
       else if(head.next==null) return head;
       ListNode second=head.next;
       ListNode third= second.next;
       second.next= head;
       head.next= swapPairs(third);
       return second; 

    //     public ListNode swapPairs(ListNode head) {
    //     if(head == null) return null;
    //     else if(head.next == null) return head;
      
    //     ListNode second = head.next;
    //     ListNode third = second.next;
        
        
    //     second.next = head;
    //     head.next = swapPairs(third);

    //     return second; // returning first node
        
    // }
    }
}