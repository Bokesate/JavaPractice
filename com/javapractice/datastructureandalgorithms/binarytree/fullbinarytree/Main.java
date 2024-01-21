package com.javapractice.datastructureandalgorithms.binarytree.fullbinarytree;

import com.javapractice.datastructureandalgorithms.binarytree._constants.InitialiseNodes;
import com.javapractice.datastructureandalgorithms.binarytree._constants.Node;

import static com.javapractice.datastructureandalgorithms.binarytree.fullbinarytree.Methods.isFull;

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
