class Solution {
    public int[] asteroidCollision(int[] num) {
            Stack<Integer> s=new Stack<>();
          //  s.push(num[0]);
       for (int i:num) {
            while (!s.isEmpty() && (i<0 && s.peek()>0 )){
                if (i+s.peek()<0){
                    s.pop();
                }else if (i+s.peek()>0){
                    i=0;
                    break ;
                }
                else{
                    s.pop();
                    i=0;
                }
            }
            if (i!=0){
                s.push(i);
            }
        }
         int n[]=new int[s.size()];
            for (int i=n.length-1;i>=0;i--){
                n[i]=s.pop();
            }
            return n;
    }
}