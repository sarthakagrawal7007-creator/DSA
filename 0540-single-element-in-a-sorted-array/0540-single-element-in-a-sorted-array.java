class Solution {
    public int singleNonDuplicate(int[] nums) {
         int l=0;
        int r=nums.length-1;
        while (l<r){
            int n=l+(r-l)/2;
            if(nums[n]!=nums[n+1]&&nums[n]!=nums[n-1]){
                return nums[n];
            }
            if (nums[l] != nums[l+1]) {
                return nums[l];
            }else{
                l+=2;
            }
            if (nums[r] != nums[r-1]){
                return nums[r];
            }else {
                r-=2;
            }
        }if(nums.length==1){
            return nums[0];
        }else{
        return -1;}
    }
}