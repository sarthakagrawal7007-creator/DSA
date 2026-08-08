class Solution {
    public int reversePairs(int[] num) {
        return (int)Inver(num,0,num.length-1);
    }
     public static long Inver(int nums[],int st,int ed){
        long count=0;
        if(st<ed){
        int mid=st+(ed-st)/2;
             count+=Inver(nums,st,mid);
             count+=Inver(nums,mid+1,ed);

             count+=merge(nums,st,mid,ed);
        }
        return count;
     }
     public static long merge(int num[],int st,int mid,int ed){
        long count=0;
        int j=mid+1;
         for (int i = st; i <=mid ; i++) {
             while (j <= ed &&  (long)num[i] > 2L*num[j]) {
                 j++;
             }
               count+=j-(mid+1);
         }
        int temp[]=new int[ed-st+1];
        int i=st;
        j=mid+1;
        int k=0;
        while (i<=mid &&j<=ed){
            if (num[i]>num[j]){
                temp[k]=num[j];
                j++;
            }else {
                temp[k]=num[i];
                i++;
            }
            k++;
        }
        while (i<=mid){
            temp[k++]=num[i++];
        }
         while (j<=ed){
             temp[k++]=num[j++];
         }
         for (int l = 0,m=st; l <temp.length ; l++,m++) {
             num[m]=temp[l];
         }
         return count;
        
    }
}