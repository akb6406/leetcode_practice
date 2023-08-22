class Solution {
    public int minDistance(String word1, String word2) {
        int n= word1.length();
        int m= word2.length();
        int deletion_opearation= n- lcs(word1, word2);
        int insert_operation= m-lcs(word1, word2);
        return deletion_opearation + insert_operation;   
    }
   
    public static  int lcs(String s1, String s2){
           int m= s1.length();
        int n= s2.length();
        int dp[][]= new int[ m+1][n+1];
         for(int j=0;j<=n;j++){
            dp[0][j]= 0;
        }
        for(int i=0;i<=m;i++){
            dp[i][0]= 0;
        }

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
             dp[i][j]= 1+ dp[i-1][j-1];
        }else
         dp[i][j]= Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[m][n];
    
    }

}