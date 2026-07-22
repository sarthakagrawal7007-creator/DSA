class Solution {
    public int reverse(int x) {
     
        int s=x;
    if(x<0){
        s=-(x);
    }
       int r=0;
       long sum=0;
       while (s>0){
           r=s%10;
           sum=sum*10+r;
           s=s/10;
       }
     if(Integer.MAX_VALUE<=sum){
        return 0;
           }  
     else if(x<0){
        return -(int)sum;
     }else{
        return (int)sum;
     }
    }
}