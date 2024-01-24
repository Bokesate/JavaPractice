package com.javapractice.datastructuresandalgorithms.datastructures.binarytree.completebinarytree;

import com.javapractice.datastructuresandalgorithms.datastructures.binarytree._constants.InitialiseNodes;
import com.javapractice.datastructuresandalgorithms.datastructures.binarytree._constants.Node;

import static com.javapractice.datastructuresandalgorithms.datastructures.binarytree.countnodes.Main.countNodes;

public class Main {
    public static void main(String[] args) {
        Node<?> completeNodes = InitialiseNodes.initialiseCompleteBinaryTreeNodes();
        Node<?> nonCompleteNodes = InitialiseNodes.initialiseNodes();

        System.out.println();
        System.out.println("completeNodes isComplete: " + Methods.isComplete(completeNodes,0, countNodes(completeNodes)));

        System.out.println();
        System.out.println("nonCompleteNodes isComplete: " + Methods.isComplete(nonCompleteNodes,0, countNodes(nonCompleteNodes)));
    }
}
