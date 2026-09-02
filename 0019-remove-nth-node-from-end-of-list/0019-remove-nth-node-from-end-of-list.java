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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }else if(head.next==null && n==1){
             return null;
        }
       int size=0;
       ListNode temp=head;
       while(temp!=null){
        temp=temp.next;
        size++;
       }
       temp=head;
       if(size-n==0){
        head=head.next;
        return head;
       }
       for(int i=1;i<size-n;i++){
           temp=temp.next;
       }
       if(temp.next.next==null){
        temp.next=null;
       }else{
       temp.next=temp.next.next;
       }
       return head;
    }
}