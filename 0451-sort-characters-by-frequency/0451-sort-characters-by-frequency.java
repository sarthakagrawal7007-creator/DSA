class Solution {
    public String frequencySort(String s) {
       int freq[]=new int[123];
        for (char ch:s.toCharArray()){
            freq[ch]++;
        }
        List<Character> l1=new ArrayList<>();
        for (char ch:s.toCharArray()){
            if (!l1.contains(ch)){
                l1.add(ch);
            }
        }
       StringBuilder st=new StringBuilder("");
        Collections.sort(l1,(a,b)->freq[b]-freq[a]);
        for (char ch:l1){
            st.append(String.valueOf(ch).repeat(freq[ch]));
        }
         return st.toString();
    }
}