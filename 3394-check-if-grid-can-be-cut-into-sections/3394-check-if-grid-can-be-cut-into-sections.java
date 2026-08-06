class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        // x-axis intervals
        List<int[]> hor = new ArrayList<>();

        // y-axis intervals
        List<int[]> vert = new ArrayList<>();

        for (int[] coord : rectangles) {
            int x1 = coord[0];
            int y1 = coord[1];
            int x2 = coord[2];
            int y2 = coord[3];

            hor.add(new int[]{x1, x2});
            vert.add(new int[]{y1, y2});
        }

        List<int[]> result1 = merge(hor);
        List<int[]> result2 = merge(vert);

        return result1.size() >= 3 || result2.size() >= 3;
    }

    private List<int[]> merge(List<int[]> intervals) {

        intervals.sort((a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> ans = new ArrayList<>();

        int start = intervals.get(0)[0];
        int end = intervals.get(0)[1];

        for (int i = 1; i < intervals.size(); i++) {

            if (intervals.get(i)[0] < end) {
                end = Math.max(end, intervals.get(i)[1]);
            } else {
                ans.add(new int[]{start, end});
                start = intervals.get(i)[0];
                end = intervals.get(i)[1];
            }
        }

        ans.add(new int[]{start, end});

        return ans;
    }
}