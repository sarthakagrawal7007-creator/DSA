class Solution {
    public int singleNonDuplicate(int[] nums) {
          int l=0;
        int r=nums.length-1;
        while (l<r){
          int n=l+(r-l)/2;
            if (nums[n]==nums[n+1]) {
               if (((r-n))%2==0){
                l=n+2;
               }else {
                   r=n-1;
               }
            }else{
                if (((r-n))%2==0){
                    r=n;
                }else {
                    l=n+1;
                }
            }
            }
            return nums[r];

    }
}