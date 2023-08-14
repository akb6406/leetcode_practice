class Solution {
    public int longestIdealString(String s, int k) {
        int n= s.length();
        // return f(s,0,0,n,k);
        // return f1(s,0,0,n,k);
        return f2(s,n,k);
    }
    public int f(String s, int ind, int prev, int n, int k){
        while(ind==n) return 0;

        int nottake= f(s,ind+1,prev ,n, k);
        int take= 0;
    if(prev==0 || Math.abs(s.charAt(ind)-prev)<=k)  {

     take= 1+ f(s,ind+1,s.charAt(ind),n,k );
    }  
        return Math.max(take, nottake); 
    }
    public int f1(String s, int ind, int prev, int n, int k){
        int dp[][]= new int[n+1][150];
        for(int row[]:dp){
            Arrays.fill(row, -1);
        }
        if(dp[ind][prev]!=-1) return dp[ind][prev];
        while(ind==n) return 0;

        int nottake= f1(s,ind+1,prev ,n, k);
        int take= 0;
    if(prev==0 || Math.abs(s.charAt(ind)-prev)<=k)  {

     take= 1+ f1(s,ind+1,s.charAt(ind),n,k );
    }  
        return dp[ind][prev]= Math.max(take, nottake); 
    }
     public int f2(String s,int n, int k){
        int dp[][] =new int[n+1][27];
        // memset(dp, 0, sizeof(dp));
        for(int i = 1; i<=s.length(); i++){
            for(int j = 0; j<=26; j++){
                if(j==26){
                    dp[i][j] = Math.max(dp[i][j], 1+dp[i-1][s.charAt(i-1)-'a']);
                }
                else if(Math.abs(s.charAt(i-1)-'a'-j)<=k){
                    dp[i][j] = Math.max(dp[i][j], 1+dp[i-1][s.charAt(i-1)-'a']);
                }
                dp[i][j] = Math.max(dp[i][j], dp[i-1][j]);
            }
        }
        return dp[n][26];
    }
}