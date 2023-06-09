//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String S) {
        // Code here
         HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0;i<S.length();i++) {
            char ch = S.charAt(i);
            
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        List<String> res = new ArrayList<>();
        permutation(map, "", res, S.length());
        
        Collections.sort(res);
        
        return res;
    }
    
    public void permutation(HashMap<Character, Integer> map, String s, List<String> list, int n) {
        if(s.length() == n) {
            list.add(s);
            return;
        }
        
        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            int value = entry.getValue();
            char ch = entry.getKey();
            
            if(value != 0) {
                map.put(ch, value-1);
                permutation(map, s + ch, list, n);
                map.put(ch, value);
            }
        }
    }
}