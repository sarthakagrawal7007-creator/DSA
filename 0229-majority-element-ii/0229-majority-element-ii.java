class Solution {
    public List<Integer> majorityElement(int[] arr) {
       HashMap<Integer,Integer> mp=new HashMap<>();
      List<Integer> l1=new ArrayList<>() ;

     
        for (int i = 0; i <arr.length ; i++) {
            int curr=arr[i];
                mp.put(curr, mp.getOrDefault(curr, 0) + 1);
            }
           for (int key : mp.keySet()) {
            if (mp.get(key) >arr.length / 3) {
                l1.add(key);
            }
        }
        return l1;
    }
}