package ValidateBinaryTree;

import ValidateBinaryTree.Tree1.TreeNode;

public class ValidateBst {
    public boolean isValidBST(Tree1.TreeNode root) {
        return checkValBst(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean checkValBst(TreeNode root,long min,long max) {
        if(root == null) return true;

        if(root.value <= min || root.value >= max) return false;
        return checkValBst(root.left,min,root.value) && checkValBst(root.right, root.value, max);
    }
}
