class Solution {
    public boolean search(int[] nums, int target) {
        return Pivit(nums,0,nums.length-1,target);
    }
         public static boolean Pivit(int nums[],int i,int j,int target){
        if(i>j){
            return false;
        }
        int m=i+(j-i)/2;
        if (nums[m]==target){
            return true;
        }
        if(nums[i]==nums[m]&&nums[j]==nums[m]){
            i++;
            j--;
            return Pivit(nums,i,j,target);
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