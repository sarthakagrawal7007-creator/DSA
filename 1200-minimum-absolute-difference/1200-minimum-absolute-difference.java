class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        // sarthak Agrawal
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int min=50;
        int i=0,j=1;
       while (j<arr.length){
           int diff=arr[j]-arr[i];
           if (diff<min){
               min=diff;
           }
           j++;
           i++;
       }
        for (int k = 0; k <arr.length-1 ; k++) {
            List<Integer> row=new ArrayList<>();
            if (arr[k+1]-min==arr[k]){
               row.add(arr[k]);
               row.add(arr[k+1]);
            result.add(row);}
        }
        return result;
    }
}