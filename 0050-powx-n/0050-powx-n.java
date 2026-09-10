class Solution {
    public double myPow(double x, int n) {
        long num = n;
        // if (num < 0) {
        //     return 1/power(x, -num);
        // }
        return power(x, num);
    }

    public double power(double x, long n) {

        if (n == 0) {
            return 1;
        }if(n<0){
        return power(1/x,-n);
        }
        double half=power(x*x, n / 2);
        if (n % 2 == 0) {
            return half;
        } else {
            return half*x;
        }
    }
}