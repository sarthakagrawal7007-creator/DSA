class Solution {
    public boolean isPowerOfThree(int n) {
         return powe(n);
    }
    public static boolean powe(int n){
        if(n<=0){
        return false;
        }else if(n==1){
            return true;
            }
    
        if(n%3==0){
            return powe(n/3);
        }else{
            return false;
        }
    
    }
}