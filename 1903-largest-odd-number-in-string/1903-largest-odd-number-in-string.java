class Solution {
    public String largestOddNumber(String str) {
        StringBuilder sb=new StringBuilder("");
        int i=0;
        int j=str.length()-1;
       sb.append(str);
        while (i<=j){
            int a=str.charAt(j)-'0';
            if (a%2!=0){
                return sb.toString();
            }
            else {
               sb.deleteCharAt(j);
            }
            j--;
        }  
        sb.toString();
        return sb.toString();
    }
}