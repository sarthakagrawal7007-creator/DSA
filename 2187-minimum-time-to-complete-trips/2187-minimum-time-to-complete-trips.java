class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long i=1;
       long j=time[0];
        for (int t:time) {
            j=Math.min(j,t);
        }
        j*=totalTrips;
        while (i<j){
            long mid=i+(j-i)/2;
            long actual_trip=0;
            for (int x:time){
                actual_trip+=mid/x;
                if (actual_trip >= totalTrips) {
                  break;
            }
            }
            if (actual_trip>=totalTrips) {
                j = mid;
            }else {
                i=mid+1;
            }
        }
        return i;
    }
}