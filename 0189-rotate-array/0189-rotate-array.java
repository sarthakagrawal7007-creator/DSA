class Solution {
    public void rotate(int[] arr, int k) {
        k=k%arr.length;
        rever(0,arr.length-1,arr);
        rever(0,k-1,arr);
        rever(k,arr.length-1,arr);
}
 public static void rever(int s,int e,int arr[]){
        if (s>e){
            return;
        }
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        rever(s+1,e-1,arr);
    }
}
