class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character,Integer> map = new HashMap<>();
        int l=0;
        int r=0;
        int max=0;
        int maxf=0;
        int flag=1;
        while(r<s.length())
        {
            if(flag==1)
            {
                map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            }
            
           maxf=Math.max(maxf,map.get(s.charAt(r)));

            if((r-l+1-maxf)<=k)
            {
               max=Math.max(max,r-l+1);
                r++;
                flag=1;
            }
            else
            {
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
                flag=0;
            }
        }

        return max;

    }
}