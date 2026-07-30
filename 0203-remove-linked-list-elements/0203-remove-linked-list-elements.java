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
    public ListNode removeElements(ListNode head, int val) {
    ListNode dum= new ListNode(-1);
         dum.next = head;
        ListNode prev =dum;
        ListNode curr = head;
            while (curr!=null){
                if (curr.val==val){
                    prev.next=curr.next;
                }else {
                    prev=curr;
                }
                curr=curr.next;
            }
            return dum.next;
    }
}