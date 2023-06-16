class Solution {
    public int minDistance(String word1, String word2) {
       int n1= word1.length();
       int n2= word2.length();
       int dp[][]=  new int[n1+1][n2+1];
       return solution(n1,n2,word1,word2,dp);
    }
    public int solution(int n1, int n2, String word1, String word2, int dp[][]){
        if(n1==0) return n2;
        if(n2==0) return n1;
        for(int row=1;row<=n1;row++){
            dp[row][0]=row;
        }
        for(int col=1;col<=n2;col++){
            dp[0][col]=col;
        }
        for(int row=1;row<=n1;row++){
            for(int col=1;col<=n2;col++){
          if(word1.charAt(row-1)==word2.charAt(col-1)){
                dp[row][col]=dp[row-1][col-1];
            }
            else{
                dp[row][col]= 1+Math.min(dp[row-1][col-1],Math.min(dp[row-1][col],dp[row][col-1]));
            }
        }
              
          }
      return dp[n1][n2];
    }
}