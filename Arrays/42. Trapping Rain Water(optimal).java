class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int lmax=0;
        int rmax=0;
        int output=0;
        while(l<r)
        {
            if(height[l]<=height[r])
            {
                if(lmax>height[l] && height[l]!=height[r])
                {
                    output+=lmax-height[l];
                }
                if(height[l]>lmax)
                {
                    lmax=height[l];
                }
                l++;
            }
            else
            {
                if(rmax>height[r])
                {
                    output+=rmax-height[r];
                }
                if(height[r]>rmax)
                {
                    rmax=height[r];
                }
                r--;
            }
        }
        return output;
    }
}