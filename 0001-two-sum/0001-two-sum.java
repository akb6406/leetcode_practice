// class Solution {
//     public int[] twoSum(int[] nums, int target) {
        public class Solution {
    public int[] twoSum(int[] numbers, int target) {
      int result[]=new int[2];
     HashMap<Integer,Integer> map= new HashMap<>();
     for(int i=0;i<numbers.length;i++){
         if(map.containsKey(target-numbers[i])){
             result[0]= map.get(target-numbers[i]);
             result[1]= i;
             
         }
         map.put(numbers[i],i);
     }
        // for(int i=0;i<numbers.length;i++){
        //     for( int j=i+1;j<numbers.length;j++){
        //         if(numbers[i]+numbers[j]==target){
        //              result[0]=i;
        //             result[1]=j;
        //         }
        //     }
            
        // }
        return result;
    }
        }
      
