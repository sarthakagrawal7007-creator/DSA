class Solution {
    public int fib(int num) {
     return fab(num);

    }
     public static int fab(int num){
        if (num==0||num==1){
            return num;
        }
        return fab(num-1)+fab(num-2);
    }        

}