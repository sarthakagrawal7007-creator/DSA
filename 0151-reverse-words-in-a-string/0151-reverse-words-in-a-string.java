import java.util.*;
class Solution {
    public String reverseWords(String s) {
        StringTokenizer st = new StringTokenizer(s);
        String str1="";
        while (st.hasMoreTokens()){
            str1=st.nextToken()+" "+str1;
        }
        return str1.trim();
    }
}