package ValidateBinaryTree;

//import apple.laf.JRSUIUtils.Tree;

public class TestValidateBst {
    public static void main(String[] args) {
        Tree1 tree = new Tree1(5);

        Tree1.TreeNode node1 = tree.addToLeftChild(tree.root, 1);
        Tree1.TreeNode node4 = tree.addToRightChild(tree.root, 4);
        Tree1.TreeNode node3 = tree.addToLeftChild(node4, 3);
        Tree1.TreeNode node6 = tree.addToRightChild(node4, 6);

        ValidateBst validTree = new ValidateBst();

        boolean isValid = validTree.isValidBST(tree.root);
        System.out.println(isValid);
    }
}
