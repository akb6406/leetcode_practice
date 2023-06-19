class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int ans[]= new int[gain.length+1];
        ans[0]=0;
        int j=0;
        for(int i=0;i<gain.length;i++){
            ans[++j]=ans[j-1]+gain[i];
            max=Math.max(max,ans[j]);
        }
        return max;
    }
}