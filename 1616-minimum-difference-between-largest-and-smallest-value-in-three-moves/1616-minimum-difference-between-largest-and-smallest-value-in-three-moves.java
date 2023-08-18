class Solution {
    public int minDifference(int[] nums) {
        int n= nums.length;
        if(n<=4) return 0;
        Arrays.sort(nums);
       int ans1=Math.abs(nums[0]-nums[n-4]);
       int ans2= Math.abs(nums[1]-nums[n-3]);
       int ans3= Math.abs(nums[2]-nums[n-2]);
       int ans4= Math.abs(nums[3]- nums[n-1]);
       return Math.min(Math.min(ans1,ans2), Math.min(ans3, ans4));
    }
}