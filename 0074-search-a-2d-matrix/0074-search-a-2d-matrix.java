class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      return Trget(matrix,target);
    }
    public static boolean Trget(int matrix[][],int target){
        int n=matrix.length;
        int m=matrix[0].length;
        int i=0;
        int j=m*n-1;
        while (i<=j ){
            int mid=i+(j-i)/2;
             if (matrix[mid/m][mid%m]==target){
                 return true;
             }
             if (matrix[mid/m][mid%m]>target){
                j=mid-1;
             }else {
                 i=mid+1;
             }
        }
        return false;
    }
}