package com.javapractice.datastructuresandalgorithms.datastructures.binarytree.perfectbinarytree;

import com.javapractice.datastructuresandalgorithms.datastructures.binarytree._constants.InitialiseNodes;
import com.javapractice.datastructuresandalgorithms.datastructures.binarytree._constants.Node;

import static com.javapractice.datastructuresandalgorithms.datastructures.binarytree.perfectbinarytree.Methods.isPerfect;

public class Main {
    public static void main(String[] args) {
        Node<?> perfectNodes = InitialiseNodes.initialisePerfectBinaryTreeNodes();
        Node<?> nonPerfectNodes = InitialiseNodes.initialiseNodes();

        System.out.println();
        System.out.println("perfectNodes isPerfect: " + isPerfect(perfectNodes));

        System.out.println();
        System.out.println("nonPerfectNodes isPerfect: " + isPerfect(nonPerfectNodes));
    }
}
