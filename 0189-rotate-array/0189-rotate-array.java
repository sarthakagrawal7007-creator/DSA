class Solution {
    public void rotate(int[] arr, int k) {
        k=k%arr.length;
        rever(0,arr.length-1,arr);
        rever(0,k-1,arr);
        rever(k,arr.length-1,arr);
}
 public static void rever(int s,int e,int arr[]){
       while(s<e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        s++;
        e--;
        }
    }
}
