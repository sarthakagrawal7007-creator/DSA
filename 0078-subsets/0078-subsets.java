class Solution {
    public List<List<Integer>> subsets(int[] nums) {
              List<List<Integer>> l2=new ArrayList<>();
              back(nums,new ArrayList<>(),0,l2);
             return l2;
    }
    public static void back(int n[],List<Integer> ans,int i,List<List<Integer>> l2){
          if(i==n.length){
             List<Integer> l1=new ArrayList<>();
             l2.add(new ArrayList<>(ans));
              return;
          }
        // Take
        ans.add(n[i]);
        back(n, ans, i + 1, l2);

        // Backtrack
        ans.remove(ans.size() - 1);

        // Not take
        back(n, ans, i + 1, l2);

    }
}