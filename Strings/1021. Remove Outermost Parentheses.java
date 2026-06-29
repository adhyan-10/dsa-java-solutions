class Solution {
    public String removeOuterParentheses(String s) {
        
        int open=0;
        int close =0;
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++)
        {
            if(open == 0)
            {
                open++;
                continue;
            }

            if(s.charAt(i)=='(')
            {
                sb.append('(');
                open++;
            }
            else
            {
                close++;
                if(open == close )
                {
                    open = 0;
                    close = 0;
                    continue;
                }
                sb.append(')');
            }
        }

        String output = sb.toString();

        return output;
    }
}