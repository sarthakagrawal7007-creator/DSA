
class Solution {
    public int countGoodNumbers(long n) {
        int mod=1000000007;
        long a=(long)(pow(5,(n+1)/2,mod));
        long b=(long)(pow(4,n/2,mod));
        return (int)((a * b) % mod);
    }
    public long pow(long x, long n,int mod) {
        if (n == 0) {
            return 1;
        }
        long half=pow((x*x) %mod, n / 2,mod);
        if (n % 2 == 0) {
            return half;
        } else {
            return (half*x)%mod;
        }
    }
}