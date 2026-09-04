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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp=head;
        ListNode pre=null;
        int size=0;
      while(temp!=null){
        temp=temp.next;
        size++;
      }
      int arr[]=new int[size];
      temp=head;
      int s=0;
      while(temp!=null){
        arr[s]=temp.val;
        temp=temp.next;
        s++;}

     sort(arr,0,arr.length-1);
      temp = head;
        s = 0;

        while (temp != null) {
            temp.val = arr[s];
            temp = temp.next;
            s++;
        }
        return head;
    }
    public static void sort(int arr[],int i,int j){
        if (i>=j){
            return;
        }
        int mid=i+(j-i)/2;
          sort(arr,i,mid);
          sort(arr,mid+1,j);
          sort(arr,i,j,mid);
    }
    public static void sort(int arr[],int i,int j,int mid){
        int temp[]=new int[j-i+1];
        int l=j;
        int p=i;
        int m=mid+1;
        int k=0;
        while (i<=mid &&m<=l){
            if (arr[i]>arr[m]){
                temp[k]=arr[m];
                m++;
            }else {
                temp[k]=arr[i];
                i++;
            }
            k++;
        }
        while (i<=mid){
            temp[k]=arr[i];
            k++;
            i++;
        }
        while (m<=l){
            temp[k]=arr[m];
            k++;
            m++;
        }
        for (int n = 0,f=p; n <temp.length ; n++,f++) {
            arr[f]=temp[n];
        }
    }
}