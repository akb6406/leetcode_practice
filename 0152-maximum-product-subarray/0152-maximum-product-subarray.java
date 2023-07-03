class Solution {
    public int maxProduct(int[] nums) {
        int n= nums.length;
       int min=1;
       int max=1;
       int ans= Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
           if(nums[i]<0){
               int temp= max;
               max= min;
               min= temp;
           }
           max= Math.max(max*nums[i], nums[i]);
           min= Math.min(min*nums[i], nums[i]);
        ans= Math.max(ans,max);
       }
       return ans;
       
    }
}