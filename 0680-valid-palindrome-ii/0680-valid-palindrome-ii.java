class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        // int one=1;
        while(i<=j ){
            if(s.charAt(i)!=s.charAt(j)){
            return (ispalindrome(s,i,j-1) || ispalindrome(s, i+1,j));
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean ispalindrome(String s, int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

        
    }
}