class Solution {
    public boolean isPalindrome(String st) {
        String s=st.toLowerCase();
        if(s==" "){
            return true;
        }else{
        int i=0,j=s.length()-1;
        while (i < j) {
            if (!isAlphaNum(s.charAt(i))) {
                i++;
                continue;
            } else if (!isAlphaNum(s.charAt(j))) {
                j--;
                continue;
            }
            // char left = Character.toLowerCase(s.charAt(i));
            // char right = Character.toLowerCase(s.charAt(j));
            if (s.charAt(i)!=s.charAt(j)) {
                return false;
            }

            i++;
            j--;
         }
        return true;
        }
    }
        public static boolean isAlphaNum ( char ch){
           return (ch >= '0' && ch <= '9')
                || (ch >= 'a' && ch <= 'z');
    }
}