class Solution {
    public boolean isPalindrome(int x) {
         int s=x;
       int r=0;
       long sum=0;
       while (s>0) {
           r = s % 10;
           sum = sum * 10 + r;
           s = s / 10;
       }
       Boolean b1=(sum==x);
       return b1;
    }
}