class Solution {
    public void rotate(int[] arr, int k) {
        int n=arr.length;
        k=k%n;
       int temp[]=new int[n];
        for (int j = 0; j <n; j++) {
         temp[(j+k)%n]=arr[j];
        }            
        for (int j = 0; j < n; j++) {
            arr[j] = temp[j];
        }
          
}
}
