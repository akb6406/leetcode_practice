class Solution {
    public int deleteGreatestValue(int[][] grid) {
      for(int i[]:grid){
          Arrays.sort(i);
      }
      int ans=0;
    for(int j=0;j<grid[0].length;j++){
        int m=-1;
        for(int row[]:grid){
            m= Math.max(m,row[j]);
        }
        ans+=m;
    }
    return ans;
    }
}