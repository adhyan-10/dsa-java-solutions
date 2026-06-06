class Solution {
    public int maxArea(int[] height) {
        int output=0;
        int i=0;
        int j=height.length-1;
        while(i<j)
        {
            int vol=Math.min(height[i],height[j])*(j-i);
            if(vol>output)
            {
                output=vol;
            }
            
            if(height[i]<=height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return output;
        
    }
}