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
            System.out.println(ob.isSumString(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int isSumString(String S){
        // code here
         int n = S.length();
        
        if(n<=1) return 1;
        
        for(int i=n-1;i>=0; i--)
        {
            if(n-i>13) break;
            double sum = Double.parseDouble(S.substring(i, n));
            
            for(int j=i-1; j>=0; j--)
            {
                if(i-j>13) break;
                double num1 = Double.parseDouble(S.substring(j, i));
                
                if(num1<sum)
                {
                    for(int k=j-1; k>=0; k--)
                    {
                        if(k-j>13) break;
                        double num2 = Double.parseDouble(S.substring(k, j));
                        
                        if(num1+num2==sum)
                        {
                            //System.out.println(num1+" "+ num2+" "+sum);
                            if(k==0) return 1;
                            
                            if(isSumString(S.substring(0, i))==1) return 1;
                        }
                        else if(num1+num2>sum)
                        {
                            break;
                        }
                    }
                }
                else
                {
                    break;
                }
            }
        }
        
        return 0;
    }
}