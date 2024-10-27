package MinDepthOfBinaryTree;

import javax.swing.tree.TreeNode;

import org.w3c.dom.DOMStringList;

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

    public Tree1(int num) {
        root = new TreeNode(num);
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
}
