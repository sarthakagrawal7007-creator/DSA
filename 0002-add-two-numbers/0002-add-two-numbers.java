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
    public ListNode addTwoNumbers(ListNode temp1, ListNode temp2 ) {
       ListNode L1=temp1;
       ListNode L2=temp2;
       ListNode dummy=new ListNode(0);
       ListNode sum=dummy;
        int carry=0;
       while(L1!=null||L2!=null){
         int total=carry;
          if(L1!=null){
            total += L1.val;
             L1=L1.next;
          }
          if(L2!=null){
              total += L2.val;
                L2=L2.next;
          }
             carry=total/10;
             total=total%10;
        sum.next=new ListNode(total); 
        sum=sum.next;
       }
       if(carry==1){
          sum.next = new ListNode(carry);
       }
       return dummy.next;

    }
}