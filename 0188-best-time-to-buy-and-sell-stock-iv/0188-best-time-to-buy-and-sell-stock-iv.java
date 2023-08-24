class Solution {
    public int maxProfit(int k, int[] arr) {
           int n= arr.length;
    //    int ans= f(0,1,2,arr, n); // recursion
      int dp[][][]= new int[n][2][k+1];
       for (int i = 0; i < n; i++) {
        for (int j = 0; j < 2; j++) {
            Arrays.fill(dp[i][j], -1);
         }
       }
       return memoization(0,1,k,arr,n,dp);
    // return tabulation(arr,n,k);
        }
public static int memoization(int ind, int buy, int cap, int arr[], int n, int dp[][][] ){

        if(ind==n) return 0;
        if(cap==0) return 0;
        if(dp[ind][buy][cap]!=-1) return dp[ind][buy][cap];
        int profit= 0;

        if(buy==1){  // buy
            profit = Math.max( -arr[ind] + memoization(ind+1, 0,cap,arr,n,dp),
                                  0+memoization(ind+1,1,cap,arr,n,dp));
        }else{   // sell
            profit = Math.max(arr[ind]+ memoization(ind+1,1,cap-1,arr,n,dp),
                                   0+memoization(ind+1,0,cap,arr,n,dp));
        }
        return dp[ind][buy][cap]= profit;
    }

    public static int tabulation(int arr[], int n , int k){
        int dp[][][]= new int[n+1][2][k+1];
         
            for(int ind=0;ind<=n-1;ind++){
                for(int buy=0;buy<=1;buy++){
                    dp[ind][buy][0]=0; // when cap=0 
                }
            }
         for(int buy=0;buy<=1;buy++){
            for(int cap=0;cap<=k;cap++){
                dp[n][buy][cap]=0;   // when ind==n
            }
         }

         for(int ind=n-1;ind>=0;ind--){
              for(int buy=0;buy<=1;buy++){
                for(int cap=1;cap<=k;cap++){  // cap started from 1 because if cap==0 value should be zero that is mentioned in base cases
                    if(buy==1){  // buy
      dp[ind][buy][cap] = Math.max( -arr[ind] + dp[ind+1][0][cap],
                                  0+dp[ind+1][1][cap]);
        }else{   // sell
           dp[ind][buy][cap] = Math.max(arr[ind]+dp[ind+1][1][cap-1],
                                     0+dp[ind+1][0][cap]);
        }
       
                }
              }
            }
            return dp[0][1][k];
    
    }
}