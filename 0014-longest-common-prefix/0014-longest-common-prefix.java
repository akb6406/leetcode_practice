class Solution {
    public String longestCommonPrefix(String[] str) {
     
    StringBuilder prefix= new StringBuilder(str[0]);
    for(int i=1;i<str.length;i++){
         int index=0;
         while(index<prefix.length() && index<str[i].length()
          && str[i].charAt(index)==prefix.charAt(index))
          index++;

          prefix.setLength(index);
    }
    return prefix.toString();















    //    StringBuilder prefix = new StringBuilder(strs[0]);
    // for(int i = 1; i < strs.length; i++) {
    //   int index = 0;
    //   while(index < prefix.length() && 
    //         index < strs[i].length() && 
    //         strs[i].charAt(index) == prefix.charAt(index)) {
    //     index++;
    //   }
      
    //   prefix.setLength(index);
    // }
    
    // return prefix.toString();
    }
}