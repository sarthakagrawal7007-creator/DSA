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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
            }
          return sort(head);
    }
     public static ListNode sort(ListNode head) {
        // Base case
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        if(head.next.next!=null){
        ListNode fast = head.next.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        }
        ListNode mid;
        mid=slow.next;
        slow.next=null;
        // Left half
        ListNode left = sort(head);

        // Right half
        ListNode right = sort(mid);

        // Merge
        return merge(left, right);
    }
    public static ListNode merge(ListNode start,ListNode end){
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while (start!=null && end!=null){
            if (start.val>=end.val){
                temp.next=end;
               end=end.next;
            }else {
                temp.next=start;
                start=start.next;
            }
            temp=temp.next;
        }
        temp.next =start!= null ? start :end;
        return dummy.next;
    }
}