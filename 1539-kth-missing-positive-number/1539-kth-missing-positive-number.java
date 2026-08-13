class Solution {
    public int findKthPositive(int[] arr, int k) {
         int i=1;
        int n=arr.length;
       int l=0;
       while (l<n && k>0){
           if (arr[l]==i){
               l++;
           }else {
               k--;
           }
           i++;
       }
       while (k-->0){
           i++;
       }
            return i-1;
       
    }
}