class Solution {
    public boolean judgeCircle(String str) {
         int x=0;
       int y=0;
        for (char ch:str.toCharArray()) {
            switch (ch) {
                case 'L' -> x--;
                case 'R' -> x++;
                case 'U' -> y++;
                case 'D' -> y--;
    
        }
        }
    return (x==0 && y==0);
    }
}