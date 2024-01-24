package com.javapractice.datastructuresandalgorithms.datastructures.binarytree.fullbinarytree;

import com.javapractice.datastructuresandalgorithms.datastructures.binarytree._constants.InitialiseNodes;
import com.javapractice.datastructuresandalgorithms.datastructures.binarytree._constants.Node;

import static com.javapractice.datastructuresandalgorithms.datastructures.binarytree.fullbinarytree.Methods.isFull;

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
