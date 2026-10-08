class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Deque<Integer> stack = new ArrayDeque<>();
        int i=temp.length-1;
        int output[]= new int[temp.length];
        int count=0;
        while(i>=0)
        {
            while(!stack.isEmpty() && temp[stack.peek()]<=temp[i])
            {
                stack.pop();
                if(stack.isEmpty())
                {
                    count=0;
                }
            }

            if(!stack.isEmpty())
            {
                count=stack.peek()-i;
            }
            stack.push(i);
            output[i--]=count;
        }

        return output;
        
    }
}