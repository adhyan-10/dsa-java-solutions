class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals , (a,b) -> Integer.compare(a[0],b[0]));
        
        ArrayList<ArrayList<Integer>> temp = new ArrayList<>();

        for(int i=0;i<intervals.length;i++)
        {
            ArrayList<Integer> row = new ArrayList<>();

            if(temp.isEmpty())
            {
                row.add(intervals[0][0]);
                row.add(intervals[0][1]);
                
                temp.add(row);
            }
            else
            {
                if(intervals[i][0]<=temp.get(temp.size()-1).get(1))
                {
                    temp.get(temp.size()-1).set(1,Math.max(intervals[i][1],temp.get(temp.size()-1).get(1)));
                }
                else
                {
                    row.add(intervals[i][0]);
                    row.add(intervals[i][1]);

                    temp.add(row);
                }
            }
        }

        int[][] output = new int[temp.size()][2];

        for(int i=0;i<temp.size();i++)
        {
            output[i][0] = temp.get(i).get(0);
            output[i][1] = temp.get(i).get(1);
        }

        return output;
    }
}