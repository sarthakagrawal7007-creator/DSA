class Solution {
    public String longestCommonPrefix(String[] str) {
         String res=str[0];
        for (int i = 1; i <str.length ; i++) {
            res=Same(res,str[i]);
            if (res==""){
                return "";
            }
        }
        return res;
    }
    public static String Same(String s1,String s2){
        if(s1.length()==1 && s1.charAt(0)!=s2.charAt(0)){
            return "";
        }
        StringBuilder sb=new StringBuilder();
        int min=Math.min(s1.length(),s2.length());
            for (int i = 0; i <min; i++) {
                if (s1.charAt(i)==s2.charAt(i)){
                   sb.append(s1.charAt(i));
                }else {
                   break;
                }
            }
           return sb.toString();
        
    }
}