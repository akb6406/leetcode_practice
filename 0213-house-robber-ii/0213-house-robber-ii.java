class Solution {
    public int rob(int[] arr) {
         int n= arr.length;
        int arr1[]= new int[n-1];
        int arr2[]= new int[n-1];
        int n1=0;
        int n2=0;
        for(int i=0;i<n;i++){
            if(i!=0){
                arr1[n1++]=arr[i];
            }
            if(i!=n-1){
                arr2[n2++]= arr[i];
            }
        }
        if(arr1.length==0 || arr2.length==0) return arr[0];
        return Math.max(solve(arr2), solve(arr1));
    }
    public static int solve(int arr[]){
        // if(arr.length==0) return arr[];
        int prev1= arr[0];
    int prev2=0;
    for(int i=1;i<arr.length;i++){
        int pick= arr[i];
        if(i>1) pick += prev2;
        int notpick= 0+ prev1;
        int curr= Math.max(pick,notpick);
        prev2=prev1;
        prev1= curr;
    }
    return prev1;
    }
}