class Solution {
    public int reversePairs(int[] nums) {
  
      return coUnt(nums, 0, nums.length - 1);
    }

    public static int coUnt(int nums[], int i, int n) {

        if (i >= n) {
            return 0;
        }

        int mid = i + (n - i) / 2;

        int count = 0;

        count += coUnt(nums, i, mid);
        count += coUnt(nums, mid + 1, n);

        count += merge(nums, i, mid, n);

        return count;
    }

    public static int merge(int nums[], int o, int mid, int n) {

        int count = 0;

        // Count reverse pairs
        int j = mid + 1;

        for (int i = o; i <= mid; i++) {

            while (j <= n && (long) nums[i] > 2L * nums[j]) {
                j++;
            }

            count += j - (mid + 1);
        }

        // Merge two sorted halves
        int temp[] = new int[n - o + 1];

        int i = o;
        j = mid + 1;
        int k = 0;

        while (i <= mid && j <= n) {

            if (nums[i] <= nums[j]) {
                temp[k] = nums[i];
                i++;
            } else {
                temp[k] = nums[j];
                j++;
            }

            k++;
        }

        while (i <= mid) {
            temp[k] = nums[i];
            i++;
            k++;
        }

        while (j <= n) {
            temp[k] = nums[j];
            j++;
            k++;
        }

        // Copy back
        for (int l = 0, p = o; l < temp.length; l++, p++) {
            nums[p] = temp[l];
        }

        return count;
    }
}