class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      return Trget(matrix,target);
    }
    public static boolean Trget(int matrix[][],int target){
        int n=matrix.length;
        int m=matrix[0].length;
        int i=0;
        int j=n-1;
        while (i<=j ){
            int mid=i+(j-i)/2;
             if (matrix[mid][0]<= target && target<=matrix[mid][m-1]){
                 return Rows(matrix,target,mid);
             }
             if (matrix[mid][m-1]<target){
                i=mid+1;
             }else {
                 j=mid-1;
             }
        }
        return false;
    }
    public static boolean Rows(int matrix[][],int target,int l){
        int i=0;
        int j=matrix[0].length-1;
        while (i<=j){
            int mid=i+(j-i)/2;
            if (matrix[l][mid]==target){
                return true;
            }else if (matrix[l][mid]<target){
                i=mid+1;
            }else {
                j=mid-1;
            }
        }
        return false;
    }
}