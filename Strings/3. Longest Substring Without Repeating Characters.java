class Solution {
    public int lengthOfLongestSubstring(String s) {
        int r=0;
        int l=0;
        int max=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(r<s.length())
        {
            int len=0;
            if(map.containsKey(s.charAt(r)) && map.get(s.charAt(r))>=l)
            {
                
                l=map.get(s.charAt(r))+1;
                
            }

            map.put(s.charAt(r),r);

            len = r-l+1;
            max=Math.max(max,len);
            
            r++;
        }
        return max;
    }
}