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
    public ListNode middleNode(ListNode head) {
        ListNode curr= head;
        int count=0;
        while(curr!=null){
            curr= curr.next;
            count++;
        }
        // ListNode 
        int mid= (int)Math.ceil(count/2);
        for(int i=0;i<mid;i++){
        head= head.next;
        }
        return head;
    }
}