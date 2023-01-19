
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
 
class mirrorTree {

    public boolean traversal(TreeNode rightTree, TreeNode leftTree){
        if (rightTree == null || leftTree == null){ 
            // We have found the end of one tree, lets see if this layer passed the test
            return rightTree == leftTree;
        } // Assuming that we arent at the end lets continue to check if the values match
        if (rightTree.val != leftTree.val)
            return false;
        return traversal(rightTree.right, leftTree.left) && traversal(rightTree.left, leftTree.right);
    }   

    public boolean isSymmetric(TreeNode root) {
            return root == null || traversal(root.left,root.right);
        }
        
    }