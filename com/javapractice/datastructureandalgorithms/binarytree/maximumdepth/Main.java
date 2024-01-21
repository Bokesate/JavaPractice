package com.javapractice.datastructureandalgorithms.binarytree.maximumdepth;

import com.javapractice.datastructureandalgorithms.binarytree._constants.InitialiseNodes;
import com.javapractice.datastructureandalgorithms.binarytree._constants.Node;

public class Main {
    public static void main(String[] args) {
        Node<?> nodes = InitialiseNodes.initialiseNodes();

        System.out.println();
        System.out.println("Node maxDepth: " + maxDepth(nodes));
    }

    public static <T> int maxDepth(Node<T> root){
        if(root == null){
            return 0;
        }

        if(root.getLeftChild() == null && root.getRightChild() == null){
            System.out.println(root + " maxDepth: " + 0);

            return 0;
        }

        int leftMaxDepth = maxDepth(root.getLeftChild());
        int rightMaxDepth = maxDepth(root.getRightChild());

        int maxDepth = 1 + Math.max(leftMaxDepth, rightMaxDepth);

        System.out.println(root +
                " left maxDepth: " + leftMaxDepth +
                " right maxDepth: " + rightMaxDepth +
                " current maxDepth: " + maxDepth);

        return maxDepth;
    }
}
