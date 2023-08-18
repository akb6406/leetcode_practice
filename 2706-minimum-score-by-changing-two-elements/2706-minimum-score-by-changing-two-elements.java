class Solution {
    public int minimizeSum(int[] nums) {
         int n= nums.length;
        if(n<=3) return 0;
        Arrays.sort(nums);
       int ans1=Math.abs(nums[0]-nums[n-3]); // remove 2 biggest  and 0 smallest
       int ans2= Math.abs(nums[1]-nums[n-2]); // remove 1 biggest and 1 smallest
       int ans3= Math.abs(nums[2]-nums[n-1]);  // remove 0 biggest and 2 smallest
       return Math.min(Math.min(ans1,ans2),ans3);  
    }
}