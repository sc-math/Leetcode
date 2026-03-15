package leetcode.tree;

public class P2236_RootEqualsSumOfChildren {
    public boolean checkTree(TreeNode root) {
        return root.left.val + root.right.val == root.val;
    }
}
