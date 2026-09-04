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
        ListNode fast = head;
        ListNode pre = null;

        // Find middle
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Split into two lists
        pre.next = null;

        // Left half
        ListNode left = sort(head);

        // Right half
        ListNode right = sort(slow);

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
        while (start!=null){
            temp.next=start;
            start=start.next;
            temp=temp.next;
        }
        while (end!=null){
            temp.next=end;
            end=end.next;
            temp=temp.next;
        }
        return dummy.next;
    }
}