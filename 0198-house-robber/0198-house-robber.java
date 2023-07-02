class Solution {
    public int rob(int[] nums) {
       int req=0;
       int notreq= 0;
       for(int  i=0;i<nums.length;i++){
           int current=notreq+nums[i];
           notreq= Math.max(notreq,req);
           req= current;
       }
       return Math.max(req,notreq);
    }
}