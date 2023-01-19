
// Question link : https://leetcode.com/problems/same-tree/submissions/875754057/

//Definition for a binary tree node.
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
 

class SymetricTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base case: Roots are different
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        else 
            return (p.val == q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);


    }
}