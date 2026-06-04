class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] post= new int[nums.length];
        int pro=1;

        for(int i=0;i<nums.length;i++)
        {
            pre[i]=pro;
            pro*=nums[i];            
        }
        pro=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            post[i]=pro;
            pro*=nums[i];   
        }

        int[] output = new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            output[i]=post[i]*pre[i];
        }
        return output;
    }
}