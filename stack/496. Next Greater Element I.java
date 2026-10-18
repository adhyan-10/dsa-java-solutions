class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();
        int output[]=new int[nums1.length];
        int i=nums2.length-1;
        while(i>=0)
        {
            if(stack.isEmpty())
            {
                map.put(nums2[i],-1);
                
            }
            else if(stack.peek()>nums2[i])
            {
                map.put(nums2[i],stack.peek());
                
            }
            else
            {
                while(!stack.isEmpty() && stack.peek()<=nums2[i])
                {
                    stack.pop();
                }

                map.put(nums2[i],(stack.isEmpty()?-1:stack.peek()));
            }
            stack.push(nums2[i]);

            i--;
        }

        for(int j=0;j<nums1.length;j++)
        {
            output[j]=map.get(nums1[j]);
        }
        return output;
        
    }
}