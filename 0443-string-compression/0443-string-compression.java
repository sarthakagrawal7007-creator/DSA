class Solution {
    public int compress(char[] ch) {
         int m=0;
     for (int i = 0; i <ch.length ; i++) {
            int count =1;
            while (i<ch.length-1 && ch[i]==ch[i+1]){
                count++;
                i++;
            }
            ch[m]=ch[i];
            m++;
            if (count > 1) {
                if(count<10){
                   ch[m] = (char)(count + '0');  
                   m++;
                }else{
                m = rec(count, ch, m);
                }
            }
        }
        return m;
    }
   public static int rec(int count, char[] ch, int m) {
                    if (count == 0) {
                        return m;
                    }

                    int r = count % 10;
                    count = count / 10;

                    m = rec(count, ch, m);

                    ch[m] = (char)(r + '0');
                    m++;

                    return m;
                }

}