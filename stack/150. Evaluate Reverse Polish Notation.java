class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i=0;i<tokens.length;i++)
        {
            int pop1=0;
            int pop2=0;
            int value=0;
            if(tokens[i].equals("+") || tokens[i].equals("*") || tokens[i].equals("-") || tokens[i].equals("/"))
            {
                pop1=stack.pop();
                pop2=stack.pop();

                if(tokens[i].equals("+"))
                {
                    value=pop2+pop1;
                }
                else if(tokens[i].equals("*"))
                {
                    value=pop2*pop1;
                }
                else if(tokens[i].equals("-"))
                {
                    value=pop2-pop1;
                }
                else
                {
                    value=pop2/pop1;
                }

                stack.push(value);
            }
            else
            {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();
    }
}
