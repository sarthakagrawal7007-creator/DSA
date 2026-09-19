class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer> s=new Stack<>();
       int maxi=0;
       //int[] arr={2,1,5,6,2,3};
       int[] nsl=new int[arr.length];
       int[] nsr=new int[arr.length];
       for (int i = arr.length-1; i>=0 ; i--) {
           while (!s.isEmpty() && arr[i]<=arr[s.peek()]){
               s.pop();
           }
           if (s.isEmpty()){
               nsr[i]=arr.length;
           }else {
           nsr[i]=s.peek();}
           s.push(i);
       }
       s.clear();
       for (int i = 0; i <arr.length ; i++) {
           while (!s.isEmpty() && arr[i]<=arr[s.peek()]){
               s.pop();
           }
           if (s.isEmpty()){
               nsl[i]=-1;
           }else {
               nsl[i]=s.peek();
           }
           s.push(i);
           int sp=s.peek();
           int sq=s.peek();
       }
       for (int i = 0; i <arr.length ; i++) {
           int area=arr[i]*(nsr[i]-nsl[i]-1);
           maxi=Math.max(maxi,area);
       }
       return maxi;
    }
}