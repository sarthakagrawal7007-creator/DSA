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

        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
       
        while (head!=null && slow!=null){
           
            temp.next=head;
            head=head.next;

            temp=temp.next;
         
            temp.next=slow;
            slow=slow.next;
            temp=temp.next;

        }
        temp.next=head!=null?head:slow;
        return dummy.next;
    }
}