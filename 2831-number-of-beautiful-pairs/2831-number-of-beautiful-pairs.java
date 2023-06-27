class Solution {
    public int countBeautifulPairs(int[] nums) {
     int count=0;
     for(int i=0;i<nums.length;i++){
         int firstdigit= nums[i];
         while(firstdigit>9){
             firstdigit/=10;
         }
         for(int j=i+1;j<nums.length;j++){

         int lastdigit= nums[j]%10;
         if(gcd(firstdigit, lastdigit)==1 ){
             count++;
         }
         }
     }         
     return count;
    }
     public int gcd(int first, int last){
       if(last==0) return first;
        return gcd(last, first % last);
     }

    }
// }



























//         int count = 0;
//         for (int i = 0; i < nums.length; i++) {
//             int firstDigit = nums[i];
//             while (firstDigit > 9) firstDigit /= 10;
//             for (int j = i + 1; j < nums.length; j++) {
//                 int lastDigit = nums[j] % 10;
//                 if (gcd(firstDigit, lastDigit) == 1) {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
//     public int gcd(int a, int b) {
//         if (b == 0) return a;
//         return gcd(b, a % b);
//     }
// }