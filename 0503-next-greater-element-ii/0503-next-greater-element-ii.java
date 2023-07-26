class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = -1;
            for (int j = 1; j < nums.length; j++) {
                if (nums[(i + j) % nums.length] > nums[i]) {
                    res[i] = nums[(i + j) % nums.length];
                    break;
                }
            }
        }
        return res;
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//         int arr[]=new int[nums.length];
//         Arrays.fill(arr,-1);
//         for(int i=0;i<nums.length;i++){
//             // int index=0;
//             for(int j=i;j<nums.length;j++){
//                 if(nums[i]<nums[j]){
//                      arr[i]=nums[j];
//                     break;
//                 }
                
//                 // break;
//             }
//                 // else
//              for(int j=0;j<i;j++){
//                 if(nums[i]<nums[j]){
//                      arr[i]=arr[i]==-1 ? nums[j]:arr[i];
//                     break;
//                 }
//             }
//             // } 
//             // index++;
//         }
//         for(int i=nums.length-1;i<nums.length;i++){
//             for(int j=0;j<nums.length;j++){
//                 if(nums[i]<nums[j]){
//                      arr[i]=arr[i]==-1 ? nums[j]:arr[i];
//                 }
//             }
//         }
//         return arr;
//     }
// }