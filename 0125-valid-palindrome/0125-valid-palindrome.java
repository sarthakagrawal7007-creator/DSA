class Solution {
    public boolean isPalindrome(String s) {
        String lower = s.toLowerCase();
        if(s==" "){
            return true;
        }
         return palin(0,lower.length()-1,lower);
    }
    public static boolean palin(int i,int j,String lower ){
        if (i>=j){
            return true;
        }if (!Character.isLetterOrDigit(lower.charAt(i))){
             return palin(i+1,j,lower);

        }else if (!Character.isLetterOrDigit(lower.charAt(j))){
           return palin(i,j-1,lower);
        }
        if (lower.charAt(i)!=lower.charAt(j)){
            return false;
        }
        return palin(i+1,j-1,lower);
    }
    
    }
    