/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> output = new ArrayList<>();

        if(root==null)
        {
            return output;
        }

        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offerLast(root);
        
        while(!queue.isEmpty())
        {
            List<Integer> inner = new ArrayList<>();
            int size=queue.size();

            for(int i=0;i<size;i++)
            {
                TreeNode temp=queue.pollFirst();
                inner.add(temp.val);
                if(temp.left!=null)
                {
                    queue.offerLast(temp.left);
                }
                if(temp.right!=null)
                {
                    queue.offerLast(temp.right);
                }
            }
            output.add(inner);
        }

        return output;

    }
}