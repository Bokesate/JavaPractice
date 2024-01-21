package com.javapractice.datastructureandalgorithms.binarytree.perfectbinarytree;

import com.javapractice.datastructureandalgorithms.binarytree._constants.InitialiseNodes;
import com.javapractice.datastructureandalgorithms.binarytree._constants.Node;

import static com.javapractice.datastructureandalgorithms.binarytree.perfectbinarytree.Methods.isPerfect;

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
