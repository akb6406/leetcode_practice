class Solution {
    public boolean validPartition(int[] nums) {
        int n= nums.length;
        boolean dp[]= new boolean[n+1];
       dp[0]=true;
        return f(nums,n,dp);
    }
    public static boolean f(int nums[], int n, boolean dp[]){
        for(int i=0;i<n;i++){
            int ind= i+1;
            if(i>0 && nums[i]==nums[i-1]){
                dp[ind] |= dp[ind-2];
            }
            if(i>1 && nums[i]==nums[i-1] && nums[i]==nums[i-2]){
                dp[ind] |= dp[ind-3];
            }
            if(i>1 && nums[i]==nums[i-1]+1 && nums[i]==nums[i-2]+2){
                dp[ind] |= dp[ind-3];
            }
        }
        return dp[n];


    }
}