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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right||head==null||head.next==null){
            return head;
        }
        ListNode temp=head;
        ListNode curr=head;
        ListNode re=head;
        for(int i=1;i<left;i++){
            curr=temp;
            temp=temp.next;
        }
        if(left>1){curr.next=null;}
        ListNode pre=null;
        ListNode current=temp;
        int si=right-left;
        int size=0;
        while(size<=si){
            size++;
            ListNode after=current.next;
            current.next=pre;
            pre=current;
            current=after;
        }
         if(left>1){curr.next=pre;}
         else{head=pre;}
          temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=current;
        return head;
    }
}