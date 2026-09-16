class Solution {
    public int[] nextGreaterElement(int[] num1, int[] num2) {
       Stack<Integer> s=new Stack<>();
       Map<Integer,Integer> m1=new HashMap<>();
      // int num1[]={4,1,2};
      // int num2[]={1,3,4,2};
       for (int i = num2.length-1; i>=0 ; i--) {
           int curr=num2[i];
           while (!s.isEmpty() && curr>num2[s.peek()]){
               s.pop();
           }if (s.isEmpty()){
               m1.put(num2[i],-1);
           }else {
               m1.put(num2[i],num2[s.peek()]);
           }
           s.push(i);
       }
       for (int i = 0; i <num1.length ; i++) {
           num1[i]=m1.get(num1[i]);
       }
       return num1;
    }
}