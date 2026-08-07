class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character,Integer> need = new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            need.put(t.charAt(i),need.getOrDefault(t.charAt(i),0)+1);
        }
        
        HashMap<Character,Integer> have = new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            have.put(t.charAt(i),0);
        }

        int n=need.size();
        int h=0;

        int i=0;
        int min=Integer.MAX_VALUE;
        int start=0;
        int end=0;
        int flag=0;
        for(int j=0;j<s.length();j++)
        {
            if(h<n)
            {
                if(need.containsKey(s.charAt(j)))
                {
                    have.put(s.charAt(j),have.get(s.charAt(j))+1);
                    if(have.get(s.charAt(j)).intValue()==need.get(s.charAt(j)).intValue())
                    {
                        h++;
                    }
                }
            }
            
            while(h==n)
            {
                if(min>(j-i+1))
                {
                    min=j-i+1;
                    flag=1;
                    start=i;
                    end=j;
                }
                if(need.containsKey(s.charAt(i)))
                {
                    have.put(s.charAt(i),have.get(s.charAt(i))-1);
                    if(have.get(s.charAt(i)).intValue()<need.get(s.charAt(i)).intValue())
                    {
                        h--;
                    }
                }
                i++;
            }
        }
        
        if(flag==0)
        {
            return "";
        }

        return s.substring(start,end+1);
        
    }
}