class Solution {
    public boolean isAnagram(String s, String t) {
         int n[]=new int[26];
        for (char ch: s.toCharArray()){
            n[ch-'a']++;
        }
        for (char ch: t.toCharArray()){
            n[ch-'a']--;
        }
        for(int i=0;i<n.length;i++){
            if(n[i]!=0){
                return false;
            }
        }
        return true;
    }
}