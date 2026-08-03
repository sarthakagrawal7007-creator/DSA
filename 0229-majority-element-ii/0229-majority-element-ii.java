class Solution {
    public List<Integer> majorityElement(int[] arr) {
       HashMap<Integer,Integer> mp=new HashMap<>();
        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            int curr=arr[i];
                mp.put(curr, mp.getOrDefault(curr, 0) + 1);
                 if (!l1.contains(curr)&& mp.get(curr) > arr.length / 3) {
                          l1.add(curr);
            }
            }
        
        return l1;
    }
}