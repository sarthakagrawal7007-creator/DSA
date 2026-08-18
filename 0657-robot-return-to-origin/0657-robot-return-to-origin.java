class Solution {
    public boolean judgeCircle(String str) {
         int x=0;
       int y=0;
        for (char ch:str.toCharArray()) {
            if (ch=='L'){
                x-=1;
            }else if (ch=='R'){
                x+=1;
            }else if (ch=='U'){
                y+=1;
            }else {
                y-=1;
            }
        }
        if (x==0 && y==0){
            return true;
        }
        return false;
    }
}