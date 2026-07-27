class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
         for (int i = 0; i <nums.length ; i++) {
            int arr=nums[i];
            int s=target-arr;
            if (map.containsKey(arr)){
                return  new int[]{map.get(arr),i};
            }
             map.put(s,i);
        }
        return new int[]{};
}}