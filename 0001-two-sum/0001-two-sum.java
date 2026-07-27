class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ne[]=new int[2];
        Map<Integer, Integer> map = new HashMap<>();
         for (int i = 0; i <nums.length ; i++) {
            int arr=nums[i];
            int s=target-arr;
            if (map.containsKey(arr)){
                ne[0]=map.get(arr);
                ne[1]=i;
            } map.put(s,i);
        }
        return ne;
    }
}