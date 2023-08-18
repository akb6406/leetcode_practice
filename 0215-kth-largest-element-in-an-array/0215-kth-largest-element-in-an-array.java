import java.util.Random;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // ist approach ---------using sorting ------------
        Arrays.sort(nums);
        return nums[nums.length-k];

        // -2nd approach-----------------using priority queue and min heap------------
    //      PriorityQueue<Integer> heap = new PriorityQueue<>();
    //     for (int num: nums) {
    //         heap.add(num);
    //         if (heap.size() > k) {
    //             heap.remove();
    //         }
    //     }
        
    //     return heap.peek();
        
    //     // ----3rd approach----------  quick selection algorithms-----
         
    //     List<Integer> list = new ArrayList<>();
    //     for (int num: nums) {
    //         list.add(num);
    //     }
        
    //     return quickSelect(list, k);
    // }
    // public int quickSelect(List<Integer> nums, int k) {
    //     int pivotIndex = new Random().nextInt(nums.size());
    //     int pivot = nums.get(pivotIndex);
        
    //     List<Integer> left = new ArrayList<>();
    //     List<Integer> mid = new ArrayList<>();
    //     List<Integer> right = new ArrayList<>();
        
    //     for (int num: nums) {
    //         if (num > pivot) {
    //             left.add(num);
    //         } else if (num < pivot) {
    //             right.add(num);
    //         } else {
    //             mid.add(num);
    //         }
    //     }
        
    //     if (k <= left.size()) {
    //         return quickSelect(left, k);
    //     }
        
    //     if (left.size() + mid.size() < k) {
    //         return quickSelect(right, k - left.size() - mid.size());
    //     }
        
    //     return pivot;

    //     // ---4th approach------------------- counting sort algorithm
    //      int minValue = Integer.MAX_VALUE;
    //     int maxValue = Integer.MIN_VALUE;
        
    //     for (int num: nums) {
    //         minValue = Math.min(minValue, num);
    //         maxValue = Math.max(maxValue, num);
    //     }
        
    //     int[] count = new int[maxValue - minValue + 1];
    //     for (int num: nums) {
    //         count[num - minValue]++;
    //     }
        
    //     int remain = k;
    //     for (int num = count.length - 1; num >= 0; num--) {
    //         remain -= count[num];
    //         if (remain <= 0) {
    //             return num + minValue;
    //         }
    //     }
        
    //     return -1;
    }
}