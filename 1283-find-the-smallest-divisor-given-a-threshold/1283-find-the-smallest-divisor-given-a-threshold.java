class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
         int i = 1;
        int j = nums[0];
        for (int x : nums) {
            j = Math.max(j, x);
        }
        while (i < j) {
            long count = 0;
            int mid = i + (j - i) / 2;
            for (int x : nums) {
                count+=(x+mid-1)/mid;
            }
           if (count>threshold){
               i=mid+1;
           }else {
               j=mid;
           }
        }
        return j;
    }
}