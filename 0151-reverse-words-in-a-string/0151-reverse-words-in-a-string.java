import java.util.*;
class Solution {
    public String reverseWords(String str) {
        String[] words=str.split(" ");
        StringBuilder sb=new StringBuilder("");
        for (int i =words.length-1  ; 0<=i ; i--) {
            if (words[i]==""){
                continue;
            }
             sb.append(words[i]);
             sb.append(" ");
        }
       // sb.toString().trim();
        return  sb.toString().trim();
    }
}