class Solution {
    public int myAtoi(String s) {
        int i = 0;

        // 1. Skip leading spaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Sign
        int sign = 1;

        if (i < s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < s.length() && s.charAt(i) == '+') {
            i++;
        }

        // 3. Recursively read digits
        long ans = convert(s, i, 0, sign);

        // 4. Clamp to int range
        if (ans > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        if (ans < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) ans;
    }

    public long convert(String s, int i, long sum, int sign) {

        // End of string or non-digit
        if (i >= s.length() || s.charAt(i) < '0' || s.charAt(i) > '9') {
            return sum * sign;
        }

        int digit = s.charAt(i) - '0';

        // Check overflow before adding digit
        if (sum > Integer.MAX_VALUE) {
            if (sign == 1) {
                return Integer.MAX_VALUE;
            } else {
                return Integer.MIN_VALUE;
            }
        }

        sum = sum * 10 + digit;

        return convert(s, i + 1, sum, sign);
    }
}