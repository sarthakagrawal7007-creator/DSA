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

        if (s == word.length()){
            return true;
        }

        if (i < 0 || i >= ch.length || j < 0 || j >= ch[0].length) {
            return false;
        }

        if (ch[i][j] != word.charAt(s)) {
           return false;
        }
        char temp = ch[i][j];
        ch[i][j] = '$';

        for (int[] dir : directions) {

            int new_i = i + dir[0];
            int new_j = j + dir[1];

            if (b1(ch, word, new_i, new_j, s+1)) {
                return true;
            }
        }

        ch[i][j] = temp;

        return false;
        }
}