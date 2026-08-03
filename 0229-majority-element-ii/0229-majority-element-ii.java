class Solution {
    public List<Integer> majorityElement(int[] arr) {
       HashMap<Integer,Integer> mp=new HashMap<>();
      List<Integer> l1=new ArrayList<>() ;

         mp.put(arr[0],1);
        for (int i = 1; i <arr.length ; i++) {
            int curr=arr[i];
                mp.put(curr, mp.getOrDefault(curr, 0) + 1);
            }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() >arr.length / 3) {
                l1.add(entry.getKey());
            }
        }
        return l1;
    }
}