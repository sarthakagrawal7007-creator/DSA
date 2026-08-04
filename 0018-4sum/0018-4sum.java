class Solution {
    public static List<List<Integer>> fourSum(int[] num, int target) {
       
       
         List<List<Integer>>l1=new ArrayList<>();
        //int num[]={1,0,-1,0,-2,2};
         Arrays.sort(num);
         int n=num.length;
        for (int i = 0; i <n-2 ; i++) {
            if (i>0&&num[i]==num[i-1]){
                continue;
            }
            for (int a = i+1; a <num.length-1 ; a++) {
                if (a > i + 1 &&num[a]==num[a-1]){
                    continue;
                }
            int j=a+1;
            int k=n-1;
            while (j<k){
                long sum =(long) num[i] + num[a] + num[j] + num[k];
                if (sum>target){
                    k--;
                }else if (sum<target) {
                    j++;
                }else if(sum==target) {
                   List<Integer> temp=new ArrayList<>();
                   temp.add(num[i]);
                   temp.add(num[a]);
                    temp.add(num[j]);
                    temp.add(num[k]);
                    l1.add(temp);
                    while (j < k && num[j] == num[j + 1]){j++;}
                    while (j < k && num[k] == num[k - 1]){k--;}
                    j++;
                    k--;
                }
            }
        }}

        return l1;
    }
    }
      