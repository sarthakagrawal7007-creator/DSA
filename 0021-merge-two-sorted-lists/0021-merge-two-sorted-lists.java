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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode L1=list1;
        ListNode L2=list2;
        ListNode dummy=new ListNode(0);
        ListNode L3=dummy;
        while(L1!=null && L2!=null){
            if(L1.val>=L2.val){
                L3.next=L2;
                L2=L2.next;
            }else{
                L3.next=L1;
                L1=L1.next;
            }
            L3=L3.next;
        }
        L3.next = (L1 != null) ? L1 : L2;
       return dummy.next;
    }
}