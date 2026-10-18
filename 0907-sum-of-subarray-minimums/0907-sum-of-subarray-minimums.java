
import java.util.*;

class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        int n = arr.length;
        int[] lsr = new int[n];
        int[] rsr = new int[n];

        // Previous Smaller Element
        for (int i = 0; i < n; i++) {
            while (!s1.isEmpty() &&
                   arr[s1.peek()] >= arr[i]) {
                s1.pop();
            }

            lsr[i] = s1.isEmpty() ? -1 : s1.peek();
            s1.push(i);
        }

        // Next Smaller or Equal Element
        for (int i = n - 1; i >= 0; i--) {
            while (!s2.isEmpty() &&
                   arr[s2.peek()] > arr[i]) {
                s2.pop();
            }

            rsr[i] = s2.isEmpty() ? n : s2.peek();
            s2.push(i);
        }

        long sum = 0;
        int mod = 1000000007;

        for (int i = 0; i < n; i++) {
            long left = i - lsr[i];
            long right = rsr[i] - i;

            sum = (sum + (long) arr[i] * left * right) % mod;
        }

        return (int) sum;
    }
}
