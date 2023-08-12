class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n= obstacleGrid.length;
        int m= obstacleGrid[0].length;
        return f(n-1,m-1, obstacleGrid);
    }
    // public static int f(int i, int j, int a[][]){
    //     if(i==0 && j==0 && a[i][j]!=1) return 1;
    //     if(i<0 || j<0) return 0;
    //     if(i>=0 && j>=0 && a[i][j]==1 ) return 0;
    //  int up= f(i-1,j,a);
    //  int left= f(i,j-1,a);
    //  return up+left;
    // }
    // public static int f(int i, int j, int a[][]){
    //     int dp[][]= new int[i+1][j+1];
    //     for(int row[]:dp){
    //         Arrays.fill(row,-1);
    //     }
    //     if(i==0 && j==0 && a[i][j]!=1) return 1;
    //     if(i<0 || j<0) return 0;
    //     if(i>=0 && j>=0 && a[i][j]==1 ) return 0;
    //     if(dp[i][j]!=-1) return dp[i][j];
    //  int up= f(i-1,j,a);
    //  int left= f(i,j-1,a);
    //  return  dp[i][j]=up+left;
    // }
    public static int f(int row, int col, int a[][]){
        int dp[][]= new int[row+2][col+2];
        // for(int row[]:dp){
        //     Arrays.fill(row,-1);
        // }
        for(int i=0;i<=row;i++){
            for(int j=0;j<=col;j++){
             if(a[i][j]==1) dp[i][j]=0;
             
            else if(i==0 && j==0) dp[i][j]=1;
                  else if(i==0) dp[i][j]=dp[i][j-1];
                  else if(j==0) dp[i][j]= dp[i-1][j]; 
             else{
     dp[i][j]=dp[i-1][j] + dp[i][j-1];
        }
        }
            }
        
        return dp[row][col];
    }
}