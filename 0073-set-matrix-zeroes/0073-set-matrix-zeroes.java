class Solution {
    public void setZeroes(int[][] num) {
      int n=num.length;
      int m=num[0].length;

      boolean row[]=new boolean[n];
      boolean column[]=new boolean[m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if (num[i][j]==0){
                    row[i]=true;
                    column[j]=true;
            }
        }
      }for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if (row[i]){
                    num[i][j]=0;
                }else if (column[j]){
                    num[i][j]=0;
                }
            }
        }
    }
}
