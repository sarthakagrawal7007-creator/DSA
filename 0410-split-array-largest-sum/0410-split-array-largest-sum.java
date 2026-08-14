class Solution {
    public int splitArray(int[] nums, int k) {
        int i=0;
     int j=0;
     for(int x:nums){
         i=Math.max(i,x);
         j+=x;
     }
    //  if (nums.length==k){
    //      System.out.println(i);
    //  }else if (k==1){
    //      System.out.println(j);
    //  }
     while (i<j){
         int mid=i+(j-i)/2;
       if (possible(nums,k,mid)){
           i=mid+1;
       }else {
           j=mid;
       }
     }
     return i;
    }
    public static boolean possible(int nums[],int k,int mid){
        int count=0;
        int m=1;
        for (int x:nums){
           if (count+x<=mid){
               count+=x;
           }else {
               m++;
               count=x;
           }
            }
        if (m>k){
            return true;
        }
        else{
            return false;
        }
    }
}