class Solution {
    public List<List<Integer>> threeSum(int[] num) {
         List<List<Integer>>l1=new ArrayList<>();
       // int num[]={-1,0,1,2,-1,-4,0,2};
        Arrays.sort(num);
        int n=num.length;
         if (num.length < 3){
            return l1;}
        for (int i = 0; i <=n-3 ; i++) {
            if (i>0 && num[i]==num[i-1]){
                continue;
            }
            int n1=num[i];
            int target=-n1;
            Twosum(target,i+1,n-1,num,l1);
        }
        return l1;
    }
    public static void Twosum(int target, int i, int j, int num[], List<List<Integer>> l1){
        while (i<j){
            if ((num[i]+num[j])>target){
                j--;
            }else if((num[i]+num[j])<target){
                i++;
            }else {
                List<Integer> temp = new ArrayList<>();
                temp.add(-target);
                temp.add(num[i]);
                temp.add(num[j]);
                l1.add(temp);
                while (i < j&&num[i]==num[i+1]){i++;}
                while (i < j&&num[j]==num[j-1]){j--;}
                i++;
                j--;
            }
           // l1.add(temp);
        }
    }
}