class Solution {
    public String longestPalindrome(String str) {
        int[][] dp=new int[str.length()][str.length()];
        int maxLen=0;
        
        int si=0,ei=0;
        for(int gap=0;gap<str.length();gap++){
            for(int s=0,e=s+gap; e<str.length(); s++,e=s+gap){
                // System.out.println(s+" "+e);
                if(gap==0) dp[s][e]=1;
                else if(gap==1 && str.charAt(s)==str.charAt(e)){
                    dp[s][e]=2;
                }
                else if(str.charAt(s)==str.charAt(e)){
                    if(dp[s+1][e-1]>0){
                        dp[s][e]=dp[s+1][e-1]+2;
                    }
                }
                
                if(dp[s][e]>maxLen){
                     maxLen=dp[s][e];
                     si=s;
                    ei=e;
                }
                
            }
        }
        
        
        return str.substring(si,ei+1);
    }
}