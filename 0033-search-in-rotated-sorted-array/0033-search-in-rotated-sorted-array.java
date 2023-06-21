class Solution {
    public int search(int[] nums, int target) {
        // Arrays.sort(nums);
        int k=0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==target){
             k=i+1;
                
            }
        }
        if(k>0) return k-1;
        return -1;
       
        
    }
}