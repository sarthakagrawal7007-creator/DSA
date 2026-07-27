class Solution {
    public int majorityElement(int[] arr) {
       int major=0;
       int count=0;
       for(int i=0;i<arr.length;i++){
        if(count==0){
            major=arr[i];
            count++;
        }
        else if(major==arr[i]){
            count++;
        }else{
            count --;
        }
       }
       return major;
    }
}