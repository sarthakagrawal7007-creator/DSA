class Solution {
    public int[] nextGreaterElements(int[] num) {
         Stack<Integer> s = new Stack<>();
        int[] ans = new int[num.length];

        for (int i = 2 * num.length - 1; i >= 0; i--) {

            int index = i % num.length;

            while (!s.isEmpty() && num[s.peek()] <= num[index]) {
                s.pop();
            }

            if (i < num.length) {
                if (s.isEmpty()) {
                    ans[index] = -1;
                } else {
                    ans[index] = num[s.peek()];
                }
            }

            s.push(index);
        }

        return ans;
    }
}