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
                String str = String.valueOf(count);

                for (int j = 0; j < str.length(); j++) {
                    ch[m] = str.charAt(j);
                    m++;
                }
            }
        }
        return m;    
        }
}