class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> l1=new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int s=intervals[0][0];
        int e=intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {

            if (e >= intervals[i][0]) {
                e = Math.max(e, intervals[i][1]);
            } else {
                List<Integer> te = new ArrayList<>();
                te.add(s);
                te.add(e);
                l1.add(te);

                s = intervals[i][0];
                e = intervals[i][1];
        }
        }
         List<Integer> te=new ArrayList<>();
           te.add(s);
           te.add(e);
          l1.add(te);
         int[][] ans = new int[l1.size()][2];

       for (int i = 0; i < l1.size(); i++) {
        ans[i][0] = l1.get(i).get(0);
        ans[i][1] = l1.get(i).get(1);
    }
    return ans;
    }
}