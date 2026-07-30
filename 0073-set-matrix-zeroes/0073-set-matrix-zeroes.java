class Solution {
    public void setZeroes(int[][] num) {
      int n=num.length;
      int m=num[0].length;
       
     //check 1st row is impacted or not 
     boolean firstRow=false;
     for(int i=0;i<m;i++){
        if(num[0][i]==0){
            firstRow=true;
        }
     }
     //check 1st column is impacted or not 
     boolean firstCol=false;
     for(int j=0;j<n;j++){
        if(num[j][0]==0){
            firstCol=true;
     }
    }

    for(int i=1;i<n;i++){
        for(int j=1;j<m;j++){
            if(num[i][j]==0){
                num[i][0]=0;
                num[0][j]=0;
            }
        }
    }

    for(int i=1;i<n;i++){
     for(int j=1;j<m;j++){
     if(num[i][0]==0||num[0][j]==0){
          num[i][j]=0;
         }
       }
    }

    if(firstRow){
        for(int j=0;j<m;j++){
            num[0][j]=0;
        }
    }

    if(firstCol){
        for(int i=0;i<n;i++){
            num[i][0]=0;
        }
    }
}
}
