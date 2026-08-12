class Solution {
    public int minDays(int[] bloomday, int m, int k) {
         if ((long) m * k > bloomday.length) {
            return -1;
        }
        int i=bloomday[0];
        int j=bloomday[0];
        for(int x:bloomday){
            i=Math.min(i,x);
            j=Math.max(j,x);
        }
        while (i<j){
           int count=0;
            int day=i+(j-i)/2;
            int c1=0;
            for(int x:bloomday){
                if (day>=x){
                    count++;
                    if (count==k) {
                        c1++;
                        count=0;
                    }
                }else{
                    count=0;
                }
            }
            if (c1<m){
                i=day+1;
               
            }else {
                j=day;
                
               
            }
        }
        return i;
    }
}