//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    // static String longestPalin(String S){
        // code here
        static public String help(String s, int left, int right){
	    if (left > right) return null;
	    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
		    left--;
		    right++;
	    }
	return s.substring(left + 1, right);
    }

    static String longestPalin(String s){
        if (s == null) return null;
	    String max = s.substring(0, 1);
	    for (int i = 0; i < s.length() - 1; i++){
		    String p = help(s, i, i);
		    if (p.length() > max.length()){
			    max = p;
		    }
		p = help(s, i, i + 1);
		if (p.length() > max.length()){
			max = p;
		}
	}
	return max;
    }
}