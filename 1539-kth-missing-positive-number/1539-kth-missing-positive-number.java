class Solution {
    public int findKthPositive(int[] arr, int k) {
         int j=arr.length-1;
       int i=0;
       while (i<=j){
          int m=i+(j-i)/2;
          int n=arr[m]-(m+1);
          if (n<k){
              i=m+1;
          }else {
              j=m-1;
          }
    }
     return i+k;
}
}