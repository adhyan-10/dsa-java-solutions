class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> output= new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            Set<Integer> hash=new HashSet<>();
            for(int j=i+1;j<nums.length;j++)
            {
                int third=-(nums[i]+nums[j]);
                if(hash.contains(third))
                {
                    List<Integer> trip = new ArrayList<>();
                    trip.add(nums[i]);
                    trip.add(nums[j]);
                    trip.add(third);
                    Collections.sort(trip);
                    output.add(trip);
                }
                hash.add(nums[j]);
            }
        }
        return new ArrayList<>(output);
    }
}