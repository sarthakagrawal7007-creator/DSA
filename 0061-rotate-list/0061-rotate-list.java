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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        k = k % count;
        if(k==0||k==count){
            return head;
        }

        head= rever(head);
        ListNode first=head;
        ListNode second=head;
        ListNode part1=null;
        for(int i=1;i<=k;i++) {
            part1=second;
           second=second.next;
        }
        part1.next=null;
        first=rever(first);
        second=rever(second);
        ListNode top=first;
        while (first.next!=null){
            first=first.next;
        }
        first.next=second;
        head=top;
        return head;
    }
    public static ListNode rever(ListNode head){
    ListNode pre=null;
    ListNode curr=head;
       while(curr!=null){
          ListNode after=curr.next;
          curr.next=pre;
          pre=curr;
          curr=after;
       }
       return pre;
       }
}