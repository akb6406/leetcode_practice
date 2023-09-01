class Solution {
    public int[] countBits(int n) {
    //     int ans[]= new int[n+1];
    //     for(int i=0;i<=n;i++){
    //         String str= Integer.toBinaryString(i);
    //         ans[i]=counts(str);
    //     }
    //     return ans;
       
    // }
    //     public int  counts(String str){
    //         int  count=0;
    //         for(int j=0;j<str.length();j++){
    //             if(str.charAt(j)=='1') count++;

    //         }
    //         return count;

    //     }
     int[] ans = new int[n + 1];
        for(int x = 1; x <= n; ++x){
            ans[x] = ans[x >> 1] + (x & 1);
        }
        return ans;
    }
    
}