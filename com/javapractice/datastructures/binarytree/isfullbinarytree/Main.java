package com.javapractice.datastructures.binarytree.isfullbinarytree;

import com.javapractice.datastructures.binarytree.constants.InitialiseNodes;
import com.javapractice.datastructures.binarytree.constants.Node;

import static com.javapractice.datastructures.binarytree.isfullbinarytree.Methods.isFull;

public class Main {
    public static void main(String[] args) {
        Node<?> fullBinaryTreeNodes = InitialiseNodes.initialiseFullBinaryTreeNodes();
        Node<?> nonFullBinaryTreeNode = InitialiseNodes.initialiseNodes();

        System.out.println();
        System.out.println("fullBinaryTreeNodes isFull: " + isFull(fullBinaryTreeNodes));

        System.out.println();
        System.out.println("nonFullBinaryTreeNode isFull: " + isFull(nonFullBinaryTreeNode));
    }
}
