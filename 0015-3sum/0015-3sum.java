class Solution {
        public static List<List<Integer>> threeSum(int[] nums) {
     List<List<Integer>> result=new ArrayList<>();
     int n=nums.length;
     if (n<3){
         return result;
     }//sort
        Arrays.sort(nums);
     //fixing n1 element
        for (int i = 0; i <n-2 ; i++) {
            if (i>0 && nums[i]==nums[i-1]){
               continue;
            }
            int n1=nums[i];
            int target=-n1;
            List<List<Integer>> pairs=twoSum(nums,target,i+1,n-1);
            result.addAll(pairs);
        }
     return result;
    }
    public static  List<List<Integer>>twoSum(int[] nums,int target,int i,int j){
        List<List<Integer>> pairs  =new ArrayList<>();

      while (i<j){
           if(nums[i]+nums[j]>target) {
             j--;
          }else if (nums[i]+nums[j]<target) {
             i++;
          }
          else {
             while (i<j && nums[i]==nums[i+1]) i++;
             while (i<j && nums[j]==nums[j-1]) j--;
               List<Integer> pair=new ArrayList<>();
               pairs.add(Arrays.asList(-target, nums[i], nums[j]));
               i++;
               j--;
          }
      }
      return pairs;
    }
}
