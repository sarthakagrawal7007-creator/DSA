class Solution {
    public List<Integer> majorityElement(int[] arr) {
       int majo1 = 0;
        int majo2 = 0;
        int count1 = 0;
        int count2 = 0;

        // Find candidates
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == majo1) {
                count1++;
            }
            else if (arr[i] == majo2) {
                count2++;
            }
            else if (count1 == 0) {
                majo1 = arr[i];
                count1 = 1;
            }
            else if (count2 == 0) {
                majo2 = arr[i];
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        // Verify candidates
        int f1 = 0;
        int f2 = 0;

        for (int num : arr) {
            if (num == majo1)
                f1++;
            else if (num == majo2)
                f2++;
        }List<Integer> l1 = new ArrayList<>();

        if (f1 > arr.length / 3)
            l1.add(majo1);

        if (f2 > arr.length / 3)
            l1.add(majo2);
        return l1;
    }
}