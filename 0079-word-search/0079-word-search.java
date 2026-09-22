class Solution {
      static int m, n;
    static int[][] directions = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
    };
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
        if (s==word.length()-1){
            return true;
        }
         char temp=ch[i][j];
         ch[i][j]='#';
        if (i<ch.length-1 && ch[i+1][j]==word.charAt(s+1)){
            if (b1(ch, word, i + 1, j, s + 1)) { ch[i][j] = temp; return true; }
        }if (j>0&& ch[i][j-1]==word.charAt(s+1)){
            if (b1(ch, word, i, j - 1, s + 1)) { ch[i][j] = temp; return true; }
        }
        if (j<ch[0].length-1&& ch[i][j+1]==word.charAt(s+1)){
            if (b1(ch, word, i, j + 1, s + 1)) { ch[i][j] = temp; return true; }
        }
        if (i>0&& ch[i-1][j]==word.charAt(s+1)){
            if (b1(ch, word, i - 1, j, s + 1)) { ch[i][j] = temp; return true; }
        }
         ch[i][j]=temp;
        return false;
    }
        }