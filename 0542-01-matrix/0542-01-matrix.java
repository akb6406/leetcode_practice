class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m= mat.length;
        int n = mat[0].length;
        int ans[][]= new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                ans[i][j]= mat[i][j];
            }
        }

         for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (ans[row][col] == 0) {
                    continue;
                }

                int minNeighbor = m * n;
                if (row > 0) {
                    minNeighbor = Math.min(minNeighbor, ans[row - 1][col]);
                }
                
                if (col > 0) {
                    minNeighbor = Math.min(minNeighbor, ans[row][col - 1]);
                }
                
                ans[row][col] = minNeighbor + 1;
            }
        }
        for (int row = m - 1; row >= 0; row--) {
            for (int col = n - 1; col >= 0; col--) {
                if (ans[row][col] == 0) {
                    continue;
                }
                
                int minNeighbor = m * n;
                if (row < m - 1) {
                    minNeighbor = Math.min(minNeighbor, ans[row + 1][col]);
                }
                
                if (col < n - 1) {
                    minNeighbor = Math.min(minNeighbor, ans[row][col + 1]);
                }
                
                ans[row][col] = Math.min(ans[row][col], minNeighbor + 1);
            }
        }
        return ans;
    }
}