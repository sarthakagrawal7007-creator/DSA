class Solution {
    public int searchInsert(int[] nums, int target) {
          int i=0;
        int j=nums.length-1;
       while (i<=j){
          int n=i+(j-i)/2;
           if (nums[n]==target){
               System.out.println(n);
               return n;
           } else if (nums[n]<target) {
               i=n+1;
           }else {
               j=n-1;
           }
       }
       return i;
    }
}