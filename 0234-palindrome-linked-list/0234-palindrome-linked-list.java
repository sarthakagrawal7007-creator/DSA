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
        if (head == null || head.next == null) {
            return true;
        }
        ListNode fast=head;
        ListNode pre=null;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            ListNode after=slow.next;
            slow.next=pre;
            pre=slow;
            slow=after;
        }
        if (fast != null) {
            slow = slow.next;
        }
        while(pre!=null&&slow!=null){
            if(pre.val!=slow.val){
                return false;
            }
            pre=pre.next;
            slow=slow.next;
        }
            return true;
    }
}