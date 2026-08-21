class Solution {
    public String largestOddNumber(String str) {
         for (int i = str.length()-1; i>=0 ; i--) {
            int digit = str.charAt(i) - '0';
            if (digit % 2 == 0) {
               continue;
            }else{
                return str.substring(0, i+1);
            }
        }
        return "";
    }
}