class Solution {
    public int maxSubArray(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int size=nums.length;
        int sum=0;
        int max=-999;
        if(i==j)
        {
            return nums[0];
        }
        while(i<=j)
        {
            size--;
            while(j<nums.length)
            {
                sum = 0;
                for(int x=i;x<=j;x++)
                {
                    sum+=nums[x];
                }
                if(sum>max)
                {
                    max=sum;
                }
                j++;
                i++;
            }
            i=0;
            j=size-1;
        }

        return max;
    }
}