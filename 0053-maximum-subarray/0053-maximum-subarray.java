class Solution {
    public int maxSubArray(int[] nums) {
        int ms=nums[0];
        int cs=0;
        for (int i = 0; i <nums.length ; i++) {
           // cs+=nums[i];
            if (cs<0){
                cs=0;
            }
              cs+=nums[i];
            ms=Math.max(cs,ms);
        }
        if(nums.length==1){
            return nums[0];
        }
        return ms;
    }
}