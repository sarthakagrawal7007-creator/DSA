class Solution {
    public void nextPermutation(int[] num) {
        int n=num.length-1;
        int circle_idx=-1;
        for (int i =n ; i>0 ; i--) {
            if (num[i]>num[i-1]){
                circle_idx=i-1;
                break;
            }
        }
        if (circle_idx == -1) {
            reverse(num, 0, n);
            return;
        }

            int swap_idx = circle_idx;
            for (int i = n; i >= 0; i--) {
                if (num[circle_idx]<num[i]) {
                    swap_idx = i;
                    break;
                }
            }
            //swap
            int temp = num[circle_idx];
            num[circle_idx] = num[swap_idx];
            num[swap_idx] = temp;

            reverse(num, circle_idx+1, n);
        }

        public static void reverse(int[] num, int left, int right) {
            while (left < right) {
                int temp = num[left];
                num[left] = num[right];
                num[right] = temp;

                left++;
                right--;
            }
        }
    }
