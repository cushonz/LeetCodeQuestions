// Definition for a binary tree node.
 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
 
class levelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList(); // Create an empty Q
        List<List<Integer>> res = new LinkedList(); // Create a linked list to function as result

        if (root == null) // Reached end of tree
            return res;

        q.add(root); // Adds the node to queue
        
        // Loop until Q is empty
        while (!q.isEmpty()){
            int level = q.size(); 
            List<Integer> t = new LinkedList(); // Temporary list

            for (int i = 0; i < level; i++){
                TreeNode current = q.peek(); // Look at the first node in Q
                
                if (current.left != null) // Look left and add val
                    q.offer(current.left);
                if (current.right != null) // Look right and add val
                    q.offer(current.right);
               
                t.add(q.poll().val); // Add the vals in the q to t
            }
            res.add(t); // Add the list 't' to result
        }
        return res; // Return
    }
}