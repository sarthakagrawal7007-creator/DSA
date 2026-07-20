class Solution {
    public int missingNumber(int[] num1) {
         int n=num1.length;
        for (int i = 0; i <num1.length ; i++) {
            n=n^i;
            n=n^num1[i];
        }
        return n;
    }
}