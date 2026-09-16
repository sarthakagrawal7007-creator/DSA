class Solution {
    public int[] nextGreaterElement(int[] num1, int[] num2) {
       Stack<Integer> s=new Stack<>();
      // int num1[]={4,1,2};
      // int num2[]={1,3,4,2};
       int next[]=new int[num2.length];
       for (int i = num2.length-1; i>=0 ; i--) {
           int curr=num2[i];
           while (!s.isEmpty() && curr>num2[s.peek()]){
               s.pop();
           }if (s.isEmpty()){
               next[i]=-1;
           }else {
               next[i]=num2[s.peek()];
           }
           s.push(i);

       }
       int f=0;
       int p=0;
       while (f<=num1.length-1){
           if (num1[f]==num2[p]){
               num1[f]=next[p];
               f++;
               p=-1;
           }
           p++;
       }
       return num1;
    }
}