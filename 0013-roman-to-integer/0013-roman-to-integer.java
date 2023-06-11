class Solution {
    public int romanToInt(String s) {
        int result=0, pre=0;
        for(int i=s.length()-1;i>=0;i--){
            int num=getNum(s.charAt(i));
            if(pre!=0 && pre>num){
                result-=num;
                pre=0;
                continue;
            }
          
            if(num>pre){
               pre=num;
                result+=num;
            }else{
                result+=getNum(s.charAt(i));

            }
        }
        return result;
    }
    public int getNum(char c){
        if(c=='I') return 1;
        else if(c=='V') return 5;
        else if(c=='X') return 10;
        else if(c=='L') return 50;
        else if(c=='C') return 100;
        else if(c=='D') return 500;
        else if(c=='M') return 1000;
        return 0;
    }
    
}