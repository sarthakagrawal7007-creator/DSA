class Solution {
    public int search(int[] nums, int target) {
        return Pivit(nums,0,nums.length-1,target);
    }
         public static int Pivit(int nums[],int i,int j,int target){
        if(i>j){
            return -1;
        }
        int m=i+(j-i)/2;
        if (nums[m]==target){
            return m;
        }
        //mid exist line 1
        if (nums[i]<=nums[m]){
            if (nums[i]<=target && target<=nums[m]){
                 return Pivit(nums,i,m,target);
            }else {
                 return Pivit(nums,m+1,j,target);
            }
        }
        //mid exist line 2
        else {
            if (nums[m]<=target && target<=nums[j]){
                 return Pivit(nums,m+1,j,target);
            }else {
               return Pivit(nums,i,m,target);
            }
        }
    }
}