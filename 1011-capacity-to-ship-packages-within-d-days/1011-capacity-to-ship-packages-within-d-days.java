class Solution {
    public int shipWithinDays(int[] weights, int days) {
         int i = weights[0];
        int j = 0;
        int k=0;
        for (int x : weights) {
            i = Math.min(i, x);
            k=Math.max(k,x);
           j+=x;
        }
        while (i < j) {
            int mid=i+(j-i)/2;
            if (k>mid){
                i=mid+1;
                continue;
            }
          if (Shipwithdays(weights,days,mid)>=0){
              j=mid;
          }
          else {
              i=mid+1;
          }
        }
        return i;
        }
    public static int Shipwithdays(int weights[],int days,int mid){
        int count=days-1;
        int sum=0;
        for (int x:weights){
            if (mid<x){
                return mid+1;
            }
            if (mid<=sum || sum+x>mid){
                sum=0;
                count--;
            }
            sum+=x;
        }
        return count;
    }
}