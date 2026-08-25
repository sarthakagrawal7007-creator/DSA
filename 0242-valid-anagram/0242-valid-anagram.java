class Solution {
    public boolean isAnagram(String s, String t) {
         int n[]=new int[26];
        for (char ch: s.toCharArray()){
            n[ch-'a']++;
        }
        for (char ch: t.toCharArray()){
            n[ch-'a']--;
        }
        boolean allzero=Arrays.stream(n).allMatch(element ->element ==0);
        return allzero;
}}