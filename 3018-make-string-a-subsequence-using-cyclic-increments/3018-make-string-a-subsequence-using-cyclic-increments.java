class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i=0;
        int j=0;
        while(i<str1.length() && j<str2.length()){
            int a=str1.charAt(i);
            int b= str2.charAt(j);
              if(a==b || a+1==b || a-25==b){
                  i++;
                  j++;
              }else{
                  i++;
              }

        }
        return j==str2.length();
    }
}