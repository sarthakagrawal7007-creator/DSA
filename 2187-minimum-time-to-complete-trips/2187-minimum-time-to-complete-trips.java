class Solution {
    public long minimumTime(int[] time, int totalTrips) {
       return minimumTim(time, totalTrips);
    }
     static boolean possibleHai(int[] time, long givenTime, int totalTrips) {

                long actualTrips = 0;

                for (int t : time) {
                    actualTrips += givenTime / t;

                    // Avoid unnecessary calculation
                    if (actualTrips >= totalTrips) {
                        return true;
                    }
                }

                return actualTrips >= totalTrips;
            }

             public static long minimumTim(int[] time, int totalTrips) {

                long l = 1;

                int minTime = Integer.MAX_VALUE;

                for (int t : time) {
                    minTime = Math.min(minTime, t);
                }

                long r = (long) minTime * totalTrips;

                while (l < r) {

                    long midTime = l + (r - l) / 2;

                    if (possibleHai(time, midTime, totalTrips)) {
                        r = midTime;
                    } else {
                        l = midTime + 1;
                    }
                }

                return l;
            }
}