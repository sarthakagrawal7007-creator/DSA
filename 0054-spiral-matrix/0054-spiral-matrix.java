class Solution {
    public List<Integer> spiralOrder(int[][] num) {
        List<Integer> list1 = new ArrayList<>();
        int n=num.length-1;
      int m=num[0].length-1;
      int o=0;
      int p=0;
  
    while (o <= n && p <= m) {

        // left -> right
        for (int j = p; j <= m; j++) {
            list1.add(num[o][j]);
        }
        o++;

        // top -> bottom
        for (int i = o; i <= n; i++) {
            list1.add(num[i][m]);
        }
        m--;

        // right -> left
        if (o <= n) {
            for (int j = m; j >= p; j--) {
                list1.add(num[n][j]);
            }
            n--;
        }

        // bottom -> top
        if (p <= m) {
            for (int i = n; i >= o; i--) {
                list1.add(num[i][p]);
            }
            p++;
        }
    }
   return list1;
    }
}