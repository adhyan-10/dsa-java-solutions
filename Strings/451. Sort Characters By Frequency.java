class Solution {
    public String frequencySort(String s) {

        HashMap<Character,Integer> map  = new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        List<Character> a = new ArrayList<>(map.keySet());
        a.sort((c1,c2)->map.get(c2).compareTo(map.get(c1)));

        StringBuilder sb = new StringBuilder();

        for( char ch : a)
        {
            for(int i=0;i<map.get(ch);i++)
            {
                sb.append(ch);
            }
        }

        return sb.toString();
    
        
    }
}