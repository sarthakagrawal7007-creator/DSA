class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int i = weights[0];
        int j = 0;
        for (int x : weights) {
            i = Math.min(i, x);
           j+=x;
        }
        while (i < j) {
            int mid=i+(j-i)/2;
            int count=days-1;
            int sum=0;
         outer:  { for (int x:weights){
              if (mid<x){
                  i=mid+1;
                 break outer;
              }
              if (mid<=sum || sum+x>mid){
                  sum=0;
                  count--;
              }
                 sum+=x;
              }

          if (count>=0){
              j=mid;
          }else {
              i=mid+1;
          }}

        }
        return i;
    }
}