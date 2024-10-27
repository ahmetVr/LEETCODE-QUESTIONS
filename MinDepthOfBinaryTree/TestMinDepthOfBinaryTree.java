package MinDepthOfBinaryTree;

import javax.sound.sampled.SourceDataLine;

public class TestMinDepthOfBinaryTree {
    public static void main(String[] args) {
        Tree1 tree = new Tree1(3);
        Tree1.TreeNode node9 = tree.addToLeftChild(tree.root,9);
        Tree1.TreeNode node20 = tree.addToRightChild(tree.root, 20);
        Tree1.TreeNode node15 = tree.addToLeftChild(node20, 15);
        Tree1.TreeNode node7 = tree.addToRightChild(node20, 7);

        String s = "";
    // tree.printInorder(tree.root, s);

        System.out.println(tree.minDepth(tree.root));
    } 
}
