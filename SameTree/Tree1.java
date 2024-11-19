

import javax.swing.tree.TreeNode;

import org.w3c.dom.DOMStringList;

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

    public int minDepth(Tree1.TreeNode root) {
        if(root == null) return 0;

        int left = minDepth(root.left);

        int right = minDepth(root.right);

        if(root.left == null && root.right == null) return 1;

        if(root.left == null) {
            return 1 + right;
        }

        if(root.right == null) {
            return 1 + left;
        }


        return Math.min(left,right) + 1;
    }

    public void printInorder(Tree1.TreeNode root,String s) {
        if(root == null) {
            // Do Nothing
        } else {
            printInorder(root.left, s);
            System.out.print(root.value + " ");
            printInorder(root.right, s);
        }
    }

    public static boolean isSameTree(Tree1.TreeNode p, Tree1.TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.value != q.value) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
