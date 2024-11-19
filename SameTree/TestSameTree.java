package SameTree;

import MinDepthOfBinaryTree.Tree1;

public class TestSameTree {
    public static void main(String[] args) {

        Tree1 p = new Tree1(1);
        p.addToLeftChild(p.root, 2);
        p.addToRightChild(p.root, 3);

        Tree1 q = new Tree1(1);
        q.addToLeftChild(q.root, 2);
        q.addToRightChild(q.root, 3);

        
    }
}
