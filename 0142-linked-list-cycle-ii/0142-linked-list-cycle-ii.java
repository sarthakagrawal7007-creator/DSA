/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
         ListNode slow = head;
    ListNode fast = head;

    // Step 1: Detect whether a cycle exists
    while (fast != null && fast.next != null) {
        slow = slow.next;          // 1 step
        fast = fast.next.next;     // 2 steps

        if (slow == fast) {
            // Cycle found
            break;
        }
    }

    // No cycle
    if (fast == null || fast.next == null) {
        return null;
    }

    // Step 2: Find where the cycle begins
    slow = head;

    while (slow != fast) {
        slow = slow.next;
        fast = fast.next;
    }

    return slow;
    }
}