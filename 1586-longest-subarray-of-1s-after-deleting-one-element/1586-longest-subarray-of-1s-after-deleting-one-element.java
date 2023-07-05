class Solution {
    public int longestSubarray(int[] nums) {
int start=0;
int end=0;
int zero=0;
int max=0;
while(end<nums.length){
    if(nums[end]==0){
        zero++;
    }
    while(zero>1){
        if(nums[start]==0){
            zero--;
        }
        start++;
    }
    max= Math.max(max,end-start+1);
    end++;
}
return max-1;


















































        // int i=0;
        // int j=0;
        // int zeros=0;
        // int max=0;
        // while(j<nums.length){
        //     if(nums[j]==0){
        //         zeros++;
        //     }
        //     if(zeros>1){
        //         while(zeros>1){
        //             if(nums[i]==0){
        //                 zeros--;
        //             }
        //             i++;
        //         }
        //     }else{
        //         max= Math.max(max,j-i);
        //     }
        //     j++;
        // }
        // return max;

        
    }
}