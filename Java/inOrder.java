import java.util.*;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class inOrder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorderList = new ArrayList<>();
        inorderHelper(root, inorderList);
        return inorderList;
    }

    public void inorderHelper(TreeNode root, List<Integer> inorderList) {
        if (root == null) {
            return;
        }
        inorderHelper(root.left, inorderList);
        inorderList.add(root.val);
        inorderHelper(root.right, inorderList);
    }
}