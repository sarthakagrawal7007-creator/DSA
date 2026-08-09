class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    // Find first occurrence
    public int findFirst(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int ans = -1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (nums[mid] == target) {
                ans = mid;
                j = mid - 1;       // search left
            } 
            else if (nums[mid] < target) {
                i = mid + 1;
            } 
            else {
                j = mid - 1;
            }
        }

        return ans;
    }

    // Find last occurrence
    public int findLast(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int ans = -1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (nums[mid] == target) {
                ans = mid;
                i = mid + 1;       // search right
            } 
            else if (nums[mid] < target) {
                i = mid + 1;
            } 
            else {
                j = mid - 1;
            }
        }

        return ans;
    }
}