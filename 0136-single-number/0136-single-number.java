class Solution {
    public int singleNumber(int[] nums) {
       int res=0;
        for(int i=0;i<nums.length;i++){
            // for (int j=0;j<nums.length-1;j++){
                // if(nums[i]!=nums[j]){
                    // System.out.println(nums[i]);
                // }
            res ^=nums[i];
            } 
        return res;
        }
        // return int nums[i];
    // }
}