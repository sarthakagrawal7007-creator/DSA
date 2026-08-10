class Solution {
    public int findMin(int[] nums) {
       return pivot(nums, 0, nums.length - 1);
    }

    public static int pivot(int[] nums, int i, int j) {

        // Only one element
        if (i == j) {
            return nums[i];
        }

        int mid = i + (j - i) / 2;

        // Right half is unsorted / contains minimum
        if (nums[mid] > nums[j]) {
            return pivot(nums, mid + 1, j);
        }

        // Minimum is in left half, including mid
        else {
            return pivot(nums, i, mid);
        }
    }
}