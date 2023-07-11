class Solution {
    public int theMaximumAchievableX(int num, int t) {
       if (t == 0) {
        return num;
    }
    if (num == 0) {
        return t;
    }
        // if(t==num) return num;
    
return 2*t + num;
      
        
    }
}