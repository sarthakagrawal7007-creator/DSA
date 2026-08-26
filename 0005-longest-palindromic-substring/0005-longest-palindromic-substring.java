class Solution {
    public String longestPalindrome(String s) {
        boolean b1;
        int p=0;
        int q=0;
     for (int i = 0; i <s.length() ; i++) {
            for (int j = i+1; j <s.length() ; j++) {
               if (digit(s,i,j)){
                  if (q-p<=j-i){
                       p=i;
                       q=j;
                   }
               }
            }
        }
        return s.substring(p, q+1); 
    } public static boolean digit(String s,int i,int j) {
       if (i>=j){
           return true;
       }
       if (s.charAt(i)==s.charAt(j)){
          return digit(s,i+1,j-1);
       }else {
           return false;
       }
   }
    }
