class Solution {
    public int searchInsert(int[] nums, int target) {
          int i=0;
        int j=nums.length-1;
        int n=0;
        int count=0;
       while (i<=j){
            n=i+(j-i)/2;
           if (nums[n]==target){
               System.out.println(n);
               return n;
           } else if (nums[n]<target) {
               i=n+1;
           }else {
               j=n-1;
           }
           count++;
       }
       return j+1;
    }
}