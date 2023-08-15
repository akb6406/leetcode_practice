class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map= new HashMap<>();
       
        for(int i=0;i<nums.length;i++){
            int point= target- nums[i];
            if(map.containsKey(point) && map.get(point)!=i){
                return new int[]{i, map.get(point)};
            }
             map.put(nums[i],i);
        }
      return null;
    }
}