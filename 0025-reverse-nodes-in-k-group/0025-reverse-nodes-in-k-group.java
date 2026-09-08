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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;

        // Check if at least k nodes exist
        while (count < k) {
            if (temp == null)
                return head;

            temp = temp.next;
            count++;
        }

        // Reverse the remaining groups first
        ListNode prevNode = reverseKGroup(temp, k);

        // Reverse current group
        ListNode curr = head;

        while (count > 0) {
            ListNode nextNode = curr.next;

            curr.next = prevNode;
            prevNode = curr;
            curr = nextNode;

            count--;
        }

        return prevNode;
    }
}