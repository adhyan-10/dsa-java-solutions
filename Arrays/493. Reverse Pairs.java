class Solution {
    int output=0;
    void divide(int[] arr,int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        int mid = low + (high - low)/2;
         divide(arr,low,mid);
         divide(arr,mid+1,high);
         check(arr,low,mid,high);
         merge(arr,low,mid,high);
    }

    void check(int[] arr,int low,int mid,int high)
    {
        int j=mid+1;
        
        for(int i=low;i<=mid;i++)
        {
            while(j<=high && (long) arr[i]>2L*arr[j])
            {
                j++;
            }
            output+=(j-(mid+1));
        }
    }

    void merge(int[] arr,int low,int mid,int high)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        int i=low;
        int j=mid+1;

        while(i<=mid && j<=high)
        {
            if(arr[i]<=arr[j])
            {
                temp.add(arr[i]);
                i++;
            }
            else
            {
                temp.add(arr[j]);
                j++;
            }
        }

        while(i<=mid)
        {
            temp.add(arr[i]);
            i++;
        }
        while(j<=high)
        {
            temp.add(arr[j]);
            j++;
        }

        for(int x=low;x<=high;x++)
        {
            arr[x]=temp.get(x-low);
        }
    }

    public int reversePairs(int[] nums) {

        divide(nums,0,nums.length-1);
        return output;
    }
}