class Solution {
    public int[] findPeakGrid(int[][] nums) {
        int n=nums.length-1;
        int m=nums[0].length-1;
        int i=0;
        int j=m;
        while (i<=n && j>=0){
            if(j>0 &&nums[i][j]<nums[i][j-1]){
                j--;
            }else if (i<n && nums[i][j]<nums[i+1][j]){
                i++;
            }else if(j<m && nums[i][j]<nums[i][j+1]){
                j++;
            }else {
                return new int[]{i,j};
            
            }
            }
            
        return new int[]{-1,-1};
    }
}