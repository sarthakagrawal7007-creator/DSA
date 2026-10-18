
import java.util.*;

class Solution {
    public long subArrayRanges(int[] arr) {
               Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        int n = arr.length;
        int[] lsr = new int[n];
        int[] rsr = new int[n];

        // Previous Smaller Element
        for (int i = 0; i < n; i++) {
            while (!s1.isEmpty() && arr[s1.peek()] <= arr[i]) {
                s1.pop();
            }

            lsr[i] = s1.isEmpty() ? -1 : s1.peek();
            s1.push(i);
        }

        // Next Smaller or Equal Element
        for (int i = n - 1; i >= 0; i--) {
            while (!s2.isEmpty() && arr[s2.peek()] < arr[i]) {
                s2.pop();
            }

            rsr[i] = s2.isEmpty() ? n : s2.peek();
            s2.push(i);
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {
            long left = i - lsr[i];
            long right = rsr[i] - i;

            sum = (sum + (long) arr[i] * left * right);
        }
        Stack<Integer> s3 = new Stack<>();
        Stack<Integer> s4 = new Stack<>();

        int[] ls1 = new int[n];
        int[] rs2 = new int[n];

        // Previous Smaller Element
        for (int i = 0; i < n; i++) {
            while (!s3.isEmpty() && arr[s3.peek()] >= arr[i]) {
                s3.pop();
            }

            lsr[i] = s3.isEmpty() ? -1 : s3.peek();
            s3.push(i);
        }

        // Next Smaller or Equal Element
        for (int i = n - 1; i >= 0; i--) {
            while (!s4.isEmpty() && arr[s4.peek()] > arr[i]) {
                s4.pop();
            }

            rsr[i] = s4.isEmpty() ? n : s4.peek();
            s4.push(i);
        }

        long su1 = 0;

        for (int i = 0; i < n; i++) {
            long left = i - lsr[i];
            long right = rsr[i] - i;

            su1 = (su1 + (long) arr[i] * left * right);
        }
        return sum - su1;
    }
}
