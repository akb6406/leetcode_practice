class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m= text1.length();
        int n= text2.length();
        // return lcs(m-1,n-1, text1, text2); // recursion
        int dp[][]= new  int [m][n];
        for(int row[]:dp){
            Arrays.fill(row, -1);
        }
        // return lcs1(m-1, n-1, text1, text2, dp); // memoization
        // return lcs_T(text1, text2); // tabulation
        return lcs_Space(text1, text2);
    }
    public static int lcs(int ind1, int ind2, String s1, String s2){
        if(ind1<0 || ind2<0) return 0;
        if(s1.charAt(ind1)==s2.charAt(ind2)){
            return 1+ lcs(ind1-1, ind2-1, s1, s2);
        }
        return Math.max(lcs(ind1-1, ind2,s1,s2), lcs(ind1,ind2-1, s1, s2));
    }
    public static int lcs1(int ind1, int ind2, String s1, String s2, int dp[][]){
        if(ind1<0 || ind2<0) return 0;
        if(dp[ind1][ind2]!=-1) return dp[ind1][ind2];
        if(s1.charAt(ind1)==s2.charAt(ind2)){
            return dp[ind1][ind2]= 1+ lcs(ind1-1, ind2-1, s1, s2);
        }
        return dp[ind1][ind2]= Math.max(lcs(ind1-1, ind2,s1,s2), 
                                        lcs(ind1,ind2-1, s1,s2));
    }

    public static int lcs_T(String s1, String s2){
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

    public static int lcs_Space(String s1, String s2){
        int m= s1.length();
        int n= s2.length();
        // int dp[][]= new int[ m+1][n+1];
        int prev[]= new int[n+1];
        int curr[]= new int[n+1];
         for(int j=0;j<=n;j++){
            prev[j]= 0;
        }
        // for(int i=0;i<=m;i++){
        //     dp[i][0]= 0;
        // }

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
             curr[j]= 1+ prev[j-1];
        }else
         curr[j]= Math.max(prev[j], curr[j-1]);
            }
            prev=(int[])(curr.clone());
        }
        return prev[n];
    }
}