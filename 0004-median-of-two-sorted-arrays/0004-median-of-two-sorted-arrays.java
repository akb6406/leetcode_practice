class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

     int n=nums1.length;
     int m=nums2.length;
     int ans[]= new int[m+n];
     int i=0;
     int j=0;
     int k=0;

     while(i<n && j<m){
         if(nums1[i]<nums2[j]){
             ans[k]=nums1[i];
             i++;
             k++;
         }else{
             ans[k]=nums2[j];
             k++;
             j++;
         }
     }
     while(i<n){
         ans[k]=nums1[i];
         k++;
         i++;
     }
     while(j<m){
         ans[k]=nums2[j];
         j++;
         k++;
     }
      
      if(ans.length%2==0){
            int mid = (m+n)/2;

            
            double terms=(ans[mid-1]+ans[mid]);
            double answer = terms/2;
            return answer;
        }
        return ((double)ans[ans.length/2]);
    }
}





















//          int n=nums1.length;
//         int m=nums2.length;
//         int ans[]= new int[n+m]; // merged array
//         int i=0;
//         int j=0;
//         int k=0;
//        while(i<nums1.length && j<nums2.length) {
//            if(nums1[i]< nums2[j]){
//                ans[k]=nums1[i];
//                i++;
//                k++;
//            }else{
//                ans[k]=nums2[j];
//                j++;
//                k++;
//            }
           
//        }
//         while(i<nums1.length){
//             ans[k]=nums1[i];
//         i++;    
//             k++;
           
//         }
//         while(j<nums2.length){
//             ans[k]=nums2[j];
//            j++; 
//             k++;
           
//         }
//         // array had been merged now to find the median
//         if(ans.length%2==0){
//             int mid = (m+n)/2;
//             double terms=(ans[mid-1]+ans[mid]);
//             double answer = terms/2;
//             return answer;
//         }
//         return ((double)ans[ans.length/2]);
//     }
// }


































//  int n= nums1.length;
//         int m= nums2.length;
      
      
//               int [] ans  = new int[n+m];
//        int i=0;
//        int j=0; 
//        int k=0;
//        while(i<nums1.length&&j<nums2.length){
//         if(nums1[i]<nums2[j]){
//             ans[k]=nums1[i];
//             i++;
//             k++;

//         }else{
//             ans[k]=nums2[j];
//             j++;
//             k++;

//         }
//        }
//        while(i<nums1.length){
//         ans[k]=nums1[i];
//         i++;
//         k++;

//        }
//        while(j<nums2.length){
//         ans[k]=nums2[j];
//         j++;
//         k++;
//        }
//         // if(ans.length==1){
//         //     return ((double)ans[0]);
//         // }
//         // if(ans.length==2){
//         //     return ((double)(ans[0]+ans[1])/2);
//         // }


// if(ans.length%2==0){

// int  l = (m+n)/2;
//  double lu = (ans[l-1]+ans[l]);
//  double sol= lu/2;
// return sol;
// }

//    return ((double)ans[ans.length/2]);
//     }
// }