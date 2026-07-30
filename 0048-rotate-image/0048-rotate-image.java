class Solution {
    public void rotate(int[][] num) {
   int n=num.length;
      int m=num[0].length;
        for (int i = 0; i <n ; i++) {
            for (int j =i; j<m ; j++) {
                if (i==j){
                    continue;
                }
                int temp=num[i][j];
                num[i][j]=num[j][i];
                num[j][i]=temp;
            }
        }
        for (int i = 0; i <m; i++) {
            swap(i,n,num);
        }
    }
    public static void swap(int i,int n,int num[][]){
        int j=0;
        int k=n-1;
          while (j<n){
              int temp=num[i][j];
              num[i][j]=num[i][n-1];
              num[i][n-1]=temp;
              j++;
              n--;
          }
        }
    }