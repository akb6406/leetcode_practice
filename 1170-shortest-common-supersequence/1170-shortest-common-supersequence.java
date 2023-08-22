class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
       return lcs(str1, str2);
    }
     public static  String lcs(String s1, String s2){
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


        int len = dp[m][n];
  int i = m;
  int j = n;

  int index = len - 1;
  String ans = "";

  while (i > 0 && j > 0) {
    if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
      ans += s1.charAt(i-1);
      index--;
      i--;
      j--;
    } else if (dp[i - 1][j] > dp[i][j - 1]) {
        ans += s1.charAt(i-1);
        i--;
    } else {
        ans += s2.charAt(j-1);
        j--;
    }
    }
   
    while(i>0){
      ans += s1.charAt(i-1);
      i--;
  }
  while(j>0){
      ans += s2.charAt(j-1);
      j--;
  }
  String ans2= new StringBuilder(ans).reverse().toString();
  return ans2;
     }
}