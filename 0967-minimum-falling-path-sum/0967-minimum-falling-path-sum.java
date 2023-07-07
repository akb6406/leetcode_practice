class Solution {
    public int minFallingPathSum(int[][] matrix) {
        // return 
    // }
        // public static int minFallingPathSum(int matrix[][]){
        int n= matrix.length;
        int m= matrix[0].length;
         int maxi= (int) -1e9;
         int dp[][]= new int[n][m];
        //  for(int row[]:dp){
        //     Arrays.fill(row,-1); // for memoization
        //  }
        //  for(int j=0;j<m;j++){
        //         maxi= Math.max(maxi,solve(n-1,j,matrix));  // recursion approach
        //         // maxi= Math.max(maxi,solve1(n-1,j,matrix, dp));  // memoization approach
        //      }
        //      return maxi;

            for(int row[]:dp){
               Arrays.fill(row,0); // for tabulation form
            }
         return solve2(n,m,matrix, dp); // tabulation approach
        //  return solve3(n,m,matrix); // space optimization approach
       }
       public static int solve(int i, int j, int matrix[][]){
        if(j<0 || j>=matrix[0].length) return (int) -1e9;

        if(i==0) return matrix[0][j];
        
        int up= matrix[i][j]+solve(i-1,j,matrix);
        int ld= matrix[i][j]+solve(i-1,j-1,matrix);
        int rd= matrix[i][j]+solve(i-1,j+1,matrix);
        return Math.max(up,Math.max(ld,rd));
       }
       public static int solve1(int i, int j, int matrix[][], int dp[][]){
        if(j<0 || j>=matrix[0].length) return (int) -1e9;

        if(i==0) return matrix[0][j];
        if(dp[i][j]!=-1) return dp[i][j];
        int up= matrix[i][j]+solve1(i-1,j,matrix,dp);
        int ld= matrix[i][j]+solve1(i-1,j-1,matrix,dp);
        int rd= matrix[i][j]+solve1(i-1,j+1,matrix,dp);
        return dp[i][j]= Math.max(up,Math.max(ld,rd));
       }
       public static int solve2(int n, int m, int matrix[][], int dp[][] ){
        
        for(int j=0;j<m;j++) {
            dp[0][j]= matrix[0][j];
        }
        
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){

            int up= matrix[i][j]+dp[i-1][j];
            int ld= matrix[i][j];
            if(j-1>=0) ld +=dp[i-1][j-1];
            else ld+= (int)1e9;
            int rd= matrix[i][j];
            if(j+1<m)   rd += dp[i-1][j+1];
            else rd+=(int)1e9;

            dp[i][j]= Math.min(up,Math.min(ld,rd));
            }
        }
        int maxi=(int)1e9;
        for(int j=0;j<m;j++){
            maxi=Math.min(maxi, dp[n-1][j]);
        }
        return maxi;
       }

       public static int solve3(int n, int m, int matrix[][]){
        int prev[]= new int[m];
        int curr[]= new int[m];
       
        //    Arrays.fill(prev,0);
        //    Arrays.fill(curr,0);
           for(int j=0; j<m; j++){
            prev[j] = matrix[0][j];
        }
        
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){

            int up= matrix[i][j]+prev[j];
            int ld= matrix[i][j];
            if(j-1>=0) ld +=prev[j-1];
            else ld+= (int) -1e9;
            int rd= matrix[i][j];
            if(j+1<m)   rd += prev[j+1];
            else rd+=(int) -1e9;

            curr[j]= Math.max(up,Math.max(ld,rd));
            }
            prev= curr;
        }
        int maxi=(int) -1e9;
        for(int j=0;j<m;j++){
            maxi=Math.max(maxi, prev[j]);
        }
        return maxi;
       
       
     
    }
}