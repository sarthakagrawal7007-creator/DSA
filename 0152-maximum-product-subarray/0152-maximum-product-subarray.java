class Solution {
    public int maxProduct(int[] nums) {
          int count=nums[0];
        int max=nums[0];
        for(int i=1 ;i<nums.length ; i++){
            if(count==0){
               count=1;
            }count*=nums[i];
            max=Math.max(count,max);
        }
        int max1=nums[nums.length-1];
        count=nums[nums.length-1];
        for (int i = nums.length-2; i>=0 ; i--) {
           if(count==0){
               count=1;
            }count*=nums[i];
            max1=Math.max(max1,count);
        }
        max=Math.max(max1,max);
        return max;
    }
}