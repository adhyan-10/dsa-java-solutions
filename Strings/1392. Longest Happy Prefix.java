class Solution {
    public String longestPrefix(String s) {
        int i=1;
        int j=0;
        
        int[] dp  =new int[s.length()];
        dp[0]=0;
        while(i<s.length())
        {
            if(s.charAt(i)==s.charAt(j))
            {
                dp[i]=++j;
                i++;
            }
            else
            {
                if(j>0)
                {
                    j=dp[j-1];
                }
                else
                {
                    dp[i]=0;
                    i++;
                }
            }
        }

        return s.substring(0,dp[s.length()-1]);
    }
}