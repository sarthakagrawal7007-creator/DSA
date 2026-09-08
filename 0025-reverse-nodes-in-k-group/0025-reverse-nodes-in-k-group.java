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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        int sz=0;
        while(sz<k){
            if(temp==null){
                return head;
            }
            temp=temp.next;
            sz++;
        }
        ListNode prenode=reverseKGroup(temp,k);
         temp=head;
         sz=0;
           while(sz<k){
            ListNode curr=temp.next;
            temp.next=prenode;
            prenode=temp;
            temp=curr;
            sz++;
           }
           return prenode;

    }
    }