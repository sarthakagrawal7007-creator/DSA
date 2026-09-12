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
    public void reorderList(ListNode head) {
        reverseKGroup(head);
    }
      public static ListNode reverseKGroup(ListNode head) {
        if(head.next==null||head==null){
            return head;
        }
            ListNode slow=head;
            ListNode fast=head;
            ListNode pre=null;
            while(fast!=null&&fast.next!=null){
                pre=slow;
                slow=slow.next;
                fast=fast.next.next;
            }
            pre.next=null;

           pre=null;
          ListNode  curr=slow;

          while (curr!=null){
              ListNode after=curr.next;
              curr.next=pre;
              pre=curr;
              curr=after;
          }
          slow=pre;

        return zig(head,slow);
    }
    public static ListNode zig(ListNode left,ListNode right){
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
       
        while (left!=null && right!=null){
           
            temp.next=left;
            left=left.next;

            temp=temp.next;
         
            temp.next=right;
            right=right.next;
            temp=temp.next;

        }
        temp.next=left!=null?left:right;
        return dummy.next;
    }
}