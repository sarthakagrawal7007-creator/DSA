class Solution {
    public boolean isPowerOfFour(int n) {
      return powe((float)n);  
    }
    public static boolean powe(float n){
        if(n<=0){
        return false;
        }else if(n==1){
            return true;
            }
    
        if(n%4==0){
            return powe(n/4);
        }else{
            return false;
        }
    
    }
}