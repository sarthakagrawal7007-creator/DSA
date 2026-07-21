class Solution {
    public int maxSubArray(int[] arr) {
          int cm=0;
          int ms=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            cm+=arr[i];
            ms=Math.max(cm,ms);
            if (cm<0){
                cm=0;
            }
        } 
        return ms;
    }
}