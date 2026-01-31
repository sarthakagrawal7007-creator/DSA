class Solution {
    public int[][] merge(int[][] intervals) {
     List<int[]> result=new ArrayList<>();
        Arrays.sort(intervals,Comparator.comparingDouble(o->o[0]));
        int[] current = intervals[0];

        for (int i = 1; i <intervals.length ; i++) {
            int[] next=intervals[i];

            if (current[1]>=next[0]){
                current[1]=Math.max(current[1],next[1]);
            }else {
                result.add(current);
                current=next;
            }
        }
        result.add(current);
        return result.toArray(new int[result.size()][]);
    }   
    }
