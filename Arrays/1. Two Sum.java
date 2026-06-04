class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        Map<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hash.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
           if(hash.containsKey(target-nums[i]) && hash.get(target-nums[i])!=i)
           {
            output[0]=i;
            output[1]=hash.get(target-nums[i]);
            return output;
           }
        }
        return null;
    }
}