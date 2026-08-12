class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
      
      return minDys(bloomDay, m, k);
    }

    static int minDys(int[] bloomDay, int m, int k) {

        // Not enough flowers to make m bouquets
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int left = bloomDay[0];
        int right = bloomDay[0];

        // Find minimum and maximum bloom day
        for (int day : bloomDay) {
            left = Math.min(left, day);
            right = Math.max(right, day);
        }

        // Binary search
        while (left < right) {

            int mid = left + (right - left) / 2;

            if (canMake(bloomDay, mid, m, k)) {
                // Possible → try fewer days
                right = mid;
            } else {
                // Not possible → need more days
                left = mid + 1;
            }
        }

        return left;
    }

    static boolean canMake(int[] bloomDay, int day, int m, int k) {

        int flowers = 0;
        int bouquets = 0;

        for (int bloom : bloomDay) {

            if (bloom <= day) {
                flowers++;

                // k consecutive flowers → 1 bouquet
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;

                    // Stop early
                    if (bouquets == m) {
                        return true;
                    }
                }

            } else {
                // Consecutiveness breaks
                flowers = 0;
            }
        }

        return false;
        }
}