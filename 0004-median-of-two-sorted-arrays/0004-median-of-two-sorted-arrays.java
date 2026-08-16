class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int temp[]=new int[nums1.length+nums2.length];
       int i=0;
       int j=0;
       int k=0;
       while (i<nums1.length && j<nums2.length ){
           if (nums1[i]>nums2[j]){
               temp[k]=nums2[j];
               j++;
           }else {
               temp[k]=nums1[i];
               i++;
           }
           k++;
       }
       while (i<nums1.length){
           temp[k]=nums1[i];
           i++;
           k++;
       }
        while (j<nums2.length){
            temp[k]=nums2[j];
            j++;
            k++;
        }
        float median=-1;
       if (temp.length%2==0){
           median=((float) temp[temp.length/2]+(float)temp[temp.length/2-1])/2;

       }else {
           median=temp[temp.length/2];
       }
       return median;
    }
}