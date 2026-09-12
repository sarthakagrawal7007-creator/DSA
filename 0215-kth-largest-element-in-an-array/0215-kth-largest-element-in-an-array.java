class Solution {
    public int findKthLargest(int[] nums, int k) {
        MergeSort(nums,0,nums.length-1);
        int j=nums.length-1;
        while(k>1){
           j--;
           k--;
        }
        return nums[j];
    }
    public static void MergeSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid=low+(high-low)/2 ;
        MergeSort(nums,low,mid); 
        MergeSort(nums,mid+1,high);
        merge(nums,low,high,mid);
    }
    public static void merge(int[] nums,int low,int high,int mid){
        int temp[]=new int[high-low+1];
        int i=low;
        int k=0;
        int j=mid+1;
        while(i<=mid &&j<=high){
            if(nums[i]<=nums[j]){
                temp[k]=nums[i];
                i++;
            }else{
                temp[k]=nums[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
           temp[k]=nums[i];
           i++;
           k++;
        }
        while(j<=high){
           temp[k]=nums[j];
           j++;
           k++;
        }
        for(int f=0,p=low;f<temp.length;f++,p++){
            nums[p]=temp[f];
        }
    }
    }
