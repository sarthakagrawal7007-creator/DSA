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
        if(head.next==null){
            return true;
        }
      ListNode temp=head;
         int size=0;
      while(temp!=null){
        temp=temp.next;
         size++;
      }
          ListNode list1=head;
          //ListNode lista=head;
          for(int i=1;i<size/2;i++){
            list1=list1.next;
          }
          ListNode list2=null;
          if(size%2!=0){
          list2=list1.next.next;
          }else{
          list2=list1.next;
          }
           list1.next=null;
           ListNode pre=null;
           ListNode curr=head;
           while(curr!=null){
            ListNode ne=curr.next;
            curr.next=pre;
            pre=curr;
            curr=ne;
           }
           head=pre;
           for(int i=1;i<=size/2;i++){
            if(head.val!=list2.val){
                return false;
            }
            head=head.next;
            list2=list2.next;

           }
            return true;
    }
}