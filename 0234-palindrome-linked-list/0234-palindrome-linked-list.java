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
      int size1=size/2;
          ListNode list1=head;
          ListNode lista=head;
          for(int i=1;i<size1;i++){
            lista=lista.next;
          }
          ListNode list2=null;
          if(size%2!=0){
          list2=lista.next.next;
          }else{
          list2=lista.next;
          }
           lista.next=null;
           ListNode pre=null;
           ListNode curr=list1;
           while(curr!=null){
            ListNode ne=curr.next;
            curr.next=pre;
            pre=curr;
            curr=ne;
           }
           list1=pre;
           for(int i=1;i<=size1;i++){
            if(list1.val!=list2.val){
                return false;
            }
            list1=list1.next;
            list2=list2.next;

           }
            return true;
    }
}