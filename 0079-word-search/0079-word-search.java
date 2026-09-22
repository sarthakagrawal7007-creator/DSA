class Solution {
    public boolean exist(char[][] ch, String word) {
      for (int i = 0; i <ch.length; i++) {
            for (int j = 0; j <ch[0].length ; j++) {
                if (ch[i][j]==word.charAt(0)&& b1(ch,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
     public static boolean b1(char[][] ch, String word,int i, int j, int s) {
         if (i>=ch.length||i<0 ||j>=ch[0].length ||j<0 ||ch[i][j]!=word.charAt(s) ){
            return false;
        }
         if (s==word.length()-1){
            return true;
         }

         char temp=ch[i][j];
         ch[i][j]='#';
      
            if (b1(ch, word, i + 1, j, s + 1)) { ch[i][j] = temp; return true; }
    
            if (b1(ch, word, i, j - 1, s + 1)) { ch[i][j] = temp; return true; }
     
            if (b1(ch, word, i, j + 1, s + 1)) { ch[i][j] = temp; return true; }
       
            if (b1(ch, word, i - 1, j, s + 1)) { ch[i][j] = temp; return true; }
     
         ch[i][j]=temp;
        return false;
    }
        }