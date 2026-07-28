class Solution {
    public void nextPermutation(int[] nums) {

        int pivot=-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                pivot=i;
                break;
            }
        }

        int temp=0;

        if(pivot==-1)
        {
            int a=0;
            int b=nums.length-1;

            while(a<b)
            {
                temp=nums[a];
                nums[a]=nums[b];
                nums[b]=temp;
                a++;
                b--;
            }   

            return;

        }
        
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]>nums[pivot])
            {
                temp=nums[pivot];
                nums[pivot]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        
        int i=pivot+1;
        int j=nums.length-1;

        while(i<j)
        {
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }

        return;
    }
}