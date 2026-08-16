class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int s=nums1.length+nums2.length;
       int idx1=s/2-1;
       int idx2=s/2 ;
        int value1 = 0;
        int value2 = 0;

        int i=0;
       int j=0;
       int k=0;
       while (i<nums1.length && j<nums2.length ){
           if (nums1[i]>nums2[j]){
               if (k==idx1){
                   value1=nums2[j];
               }
               if (k==idx2){
                   value2=nums2[j];
               }
               j++;
           }else {
               if (k==idx1){
                   value1=nums1[i];
               }
               if (k==idx2){
                   value2=nums1[i];
               }
               i++;
           }
           k++;
       }
       while (i<nums1.length){
           if (k==idx1){
               value1=nums1[i];
           }if (k==idx2){
               value2=nums1[i];
           }
           i++;
           k++;
       }
        while (j<nums2.length){
            if (k==idx1){
                value1=nums2[j];
            }
            if (k==idx2){
                value2=nums2[j];
            }
            j++;
            k++;
        }
        double median=-1;
       if (s%2==0){
           median=(value1+value2)/2.0;
       }else {
           median=value2;
       }
       return median;
    }
}