class Solution {
    public int myAtoi(String s) {
           int i = 0;
           long sum = 0;
        int l= s.length();
         while (i < l && s.charAt(i) == ' ') {
            i++;
         }
         int sig=1;
          if (i < l && s.charAt(i) == '-') {
            sig = -1;
             i++;
          } else if (i < l && s.charAt(i) == '+') {
           i++;
         }
           while(i<l &&s.charAt(i)=='0'){
            i++;
         }
         while(i<l && (s.charAt(i)>='0'&&s.charAt(i)<='9')){
            int r=(int)(s.charAt(i)-'0');
            sum=sum*10+r;
             if (sig==1&&sum>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else if(sig==-1&&-sum<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
         }
         return (int)(sum*sig);
         
    }
    }
        