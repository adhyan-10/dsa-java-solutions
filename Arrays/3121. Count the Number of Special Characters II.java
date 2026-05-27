class Solution {
    public int numberOfSpecialChars(String word) {
        int[] small=new int[27];
        int[] big=new int[27];
        int count=0;
        for(int i=0;i<27;i++)
        {
            small[i]=-1;
            big[i]=-1;
        }
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)>='a' && word.charAt(i)<='z')
            {
                small[word.charAt(i)-97]=i;
            }
        }
        for(int i=word.length()-1;i>=0;i--)
        {
            if(word.charAt(i)>='A' && word.charAt(i)<='Z')
            {
                big[word.charAt(i)-65]=i;
            }
        }
        for(int i=0;i<27;i++)
        {
            if(small[i] != -1 && big[i] != -1 && big[i]>small[i])
            {
                count++;
            }
        }

        return count;
    }
}