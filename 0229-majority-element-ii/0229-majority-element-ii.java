class Solution {
    public List<Integer> majorityElement(int[] arr) {
       HashMap<Integer,Integer> mp=new HashMap<>();
       Set<Integer> set = new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            int curr=arr[i];
                mp.put(curr, mp.getOrDefault(curr, 0) + 1);
            if (mp.get(curr) > arr.length / 3) {
                 set.add(curr);
            }
            }
            List<Integer> l1 = new ArrayList<>(set);
        return l1;
    }
}