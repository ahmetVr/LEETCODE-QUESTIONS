package ValidateBinaryTree;

import java.lang.foreign.VaList;
import java.sql.RowId;

//import apple.laf.JRSUIUtils.Tree;

public class Tree1 {
    TreeNode root;
    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
        
        public TreeNode(int x) {
            this.value = x;
        }
    }

    public Tree1(int val) {
        root = new TreeNode(val);
    }

    public TreeNode addToLeftChild(TreeNode parent,int val) {
        TreeNode node = new TreeNode(val);
        parent.left = node;
        return node;
    }

    public TreeNode addToRightChild(TreeNode parent,int val) {
        TreeNode node = new TreeNode(val);
        parent.right = node;
        return node;
    }


   
}
