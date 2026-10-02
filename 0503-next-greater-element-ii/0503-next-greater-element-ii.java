class Solution {
   public static int[] nextGreaterElements(int[] num) {
          Stack<Integer> s=new Stack<>();
          int ns[]=new int[num.length];
            for (int i = 2*num.length-1; i>=0; i--) {
                int idx=i%num.length;
                while (!s.isEmpty() && num[idx]>=num[s.peek()]){
                    s.pop();
                }
               
                if(s.isEmpty()){
                    ns[idx]=-1;
                }else {
                    ns[idx]=num[s.peek()];

                }
                s.push(idx);

            }
            return ns;

}
}