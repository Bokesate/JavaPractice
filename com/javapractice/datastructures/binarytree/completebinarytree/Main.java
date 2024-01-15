package com.javapractice.datastructures.binarytree.completebinarytree;

import com.javapractice.datastructures.binarytree.constants.InitialiseNodes;
import com.javapractice.datastructures.binarytree.constants.Node;

import static com.javapractice.datastructures.binarytree.completebinarytree.Methods.isComplete;
import static com.javapractice.datastructures.binarytree.countnodes.Main.countNodes;

public class Main {
    public static void main(String[] args) {
        Node<?> completeNodes = InitialiseNodes.initialiseCompleteBinaryTreeNodes();
        Node<?> nonCompleteNodes = InitialiseNodes.initialiseNodes();

        System.out.println();
        System.out.println("completeNodes isComplete: " + isComplete(completeNodes,0, countNodes(completeNodes)));

        System.out.println();
        System.out.println("nonCompleteNodes isComplete: " + isComplete(nonCompleteNodes,0, countNodes(nonCompleteNodes)));
    }
}
