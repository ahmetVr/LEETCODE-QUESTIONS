package SameTree;

import javax.sound.sampled.SourceDataLine;

public class Main {
    public static void main(String[] args) {
        Tree1 treeP = new Tree1(1);

        Tree1.TreeNode node2 = treeP.addToLeftChild(treeP.root, 2);
        Tree1.TreeNode node3 = treeP.addToRightChild(treeP.root, 3);

        Tree1 treeQ = new Tree1(1);

        Tree1.TreeNode node22 = treeQ.addToLeftChild(treeQ.root, 2);
        Tree1.TreeNode node33 = treeQ.addToRightChild(treeQ.root, 3);   
        

        SameTree sameTree = new SameTree();

        boolean test1 = sameTree.isSameTree(treeP.root, treeQ.root);

    }
}
