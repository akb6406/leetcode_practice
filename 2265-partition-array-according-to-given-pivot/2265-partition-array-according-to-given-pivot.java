class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       int arr[]= new int[nums.length];
       List<Integer> before= new ArrayList<>();
       List<Integer> after= new ArrayList<>();
       int  k=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]<pivot){
               before.add(nums[i]);
           }else if(nums[i]>pivot){
               after.add(nums[i]);
           }else{
               k++;
           }
       }
       int j=0; 
       for(int i=0;i<before.size();i++){
       arr[j]= before.get(i);
       j++;
       }
       for(int i=0;i<k;i++){
           arr[j]=pivot;
           j++;
       }
       for(int i=0;i<after.size();i++){
           arr[j]= after.get(i);
           j++;
       }
       return arr;
    }
}