class Solution {
    public int myAtoi(String s) {
           int i = 0;
        int sign = 1;
        long sum = 0;
         while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Check sign
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Read digits
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {

            sum = sum * 10 + (s.charAt(i) - '0');

            // 4. Check overflow
           int p=Integer.MAX_VALUE;
           int q=Integer.MIN_VALUE;

            if (sign*sum>=p){
                 return p;}

            else if (sign*sum<=q){
                return q;}

           i++;
        }
        return (int)(sign*sum);

    }
}