class Solution {
    public int fib(int num) {
        return fun(num);
    }
   public static int fun(int n){
        if(n==0||n==1){
            return n;
        }
        return fun(n-1)+fun(n-2);
    }
    }