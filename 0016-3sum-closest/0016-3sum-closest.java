class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n= nums.length;

        int v1= nums[0]+nums[1]+nums[2];
        int v2= nums[n-3]+nums[n-2]+nums[n-1];
        if(target>v2) return v2;
        if(target<v1) return v1;
        int res=v1;
        for(int i=0;i<n-2;i++){
            // int sum= nums[i];
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum= nums[i]+nums[j]+nums[k];
                if(sum==target) return sum;
            if(Math.abs(sum-target)<Math.abs(res-target)){
                res=sum;
            }
            if(sum<target){
                j++;
            }else{
                k--;
            }
            }
        }
        return res;
    }
}