class Solution {
    public int findKthPositive(int[] arr, int k) {
         int i=0;
       int j=0;
       for (int x:arr){
           int a=x;
           while (i<x-1){
               i++;
               j++;
               if (k==j){
                   System.out.println(i);
               return i;
               }
           }
           i=a;
       }if (j<k) {
            for (int s = j; s < k && j < k; s++) {
                i++;
            }
       }
            return i;
       
    }
}