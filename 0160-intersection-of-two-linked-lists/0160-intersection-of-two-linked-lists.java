/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       int sizeA=0;
       int sizeB=0;
       ListNode tempA=headA;
       ListNode tempB=headB;

       while(tempA!=null){
        tempA=tempA.next;
        sizeA++;
       }

       tempA=headA;

       while(tempB!=null){
        tempB=tempB.next;
        sizeB++;
       } 

       tempB=headB;

       if(sizeA < sizeB){
        int B = sizeB - sizeA;
        for(int i=0;i<B;i++){
            tempB=tempB.next;
            }
        }else{
         
         int B = sizeA - sizeB;
         for(int i=0;i<B;i++){
            tempA=tempA.next;
        }
       }
       //ListNode n=new ListNode(0);
       while(tempA!=null && tempB!=null){
        if(tempA==tempB){
          return tempA;
        }
         tempA=tempA.next;
          tempB=tempB.next;
       }
       return null;
    }
}