/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        Node curr=head;   
        while(curr!=null){
           Node after=curr.next; 
           curr.next=new Node(curr.val);
           curr.next.next=after;
           curr=after;
        }

        curr=head;
        while(curr!=null &&curr.next!=null){
            if(curr.random==null){
                curr.next.random=null;
            }else{
            curr.next.random=curr.random.next;}
            curr=curr.next.next;
        }
        Node newnode=head.next;
        Node newcurr=newnode;
        curr=head;
        while(curr!=null && newcurr!=null){
            curr.next=curr.next==null?null:curr.next.next;
            newcurr.next=newcurr.next==null?null:newcurr.next.next;
            curr=curr.next;
            newcurr=newcurr.next;
        }
      return newnode;
    }
}