class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         boolean b1=false;
           for (int i=0; i<matrix.length;i++){
              b1=Trget(matrix[i],target);
               if (b1){
                  return b1;
               }
           }
           return b1;
    }
    public static boolean Trget(int matrix[],int target){
        int n=matrix.length;
        int i=0;
        int j=n-1;
        while (i<=j ){
            int mid=i+(j-i)/2;
             if (matrix[mid]==target){
                 return true;
             }
             if (matrix[mid]>target){
                j=mid-1;
             }else {
                 i=mid+1;
             }
        }
        return false;
    }
}