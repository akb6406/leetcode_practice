class Solution {
    public int longestPalindromeSubseq(String s) {
       StringBuilder s2= new StringBuilder();
       s2.append(s);
       s2.reverse();
       return lcs(s,s2.toString());
    }
    public static int lcs( String s1, String s2){
        int n= s1.length();
     int dp[][]= new int[s1.length()+1][s2.length()+1];
      for(int j=0;j<=n;j++){
        dp[0][j]=0;
     }
     for(int i=0;i<=n;i++){
        dp[i][0]=0;
     }
     for(int i=1;i<=n;i++ ){
        for(int j=1;j<=n;j++){

            if(s1.charAt(i-1)==s2.charAt(j-1)){
             dp[i][j]= 1+dp[i-1][j-1];
            }else{
               dp[i][j]= 0 + Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        }
     
     return dp[n][n];
   }
}