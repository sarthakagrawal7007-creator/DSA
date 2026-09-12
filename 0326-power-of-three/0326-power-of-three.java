class Solution {
    public boolean isPowerOfThree(int n) {
    if(n<=0){
        return false;
    }else if(n%3==0||n==1){
         return powe(n);
    }else{
        return false;
    }
    }
    public static boolean powe(int n){
        if(n%3!=0&&n!=1){
            return false;
        }
        if(n==1){
            return true;
        }else if(n<=0){
           return false;
        }
        return powe(n/3); 
    }
}