class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
       int mid=nums.length/2;
        int mov=0;
        for(int i=0;i<nums.length;i++){
             mov+=Math.abs(nums[i]-nums[mid]);
        }
       return mov;
    }
}