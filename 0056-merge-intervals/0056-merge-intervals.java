class Solution {
    public int[][] merge(int[][] intervals) {
       // List<List<Integer>> l1=new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int s=intervals[0][0];
        int e=intervals[0][1];
          List<int[]> l1 = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {

            if (e >= intervals[i][0]) {
                e = Math.max(e, intervals[i][1]);
            } else {
             l1.add(new int[]{s, e});
                s = intervals[i][0];
                e = intervals[i][1];
        }
        }
          l1.add(new int[]{s, e});
      return l1.toArray(new int[l1.size()][]);
    }
    }