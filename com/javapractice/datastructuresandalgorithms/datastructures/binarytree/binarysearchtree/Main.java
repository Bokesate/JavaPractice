package com.javapractice.datastructuresandalgorithms.datastructures.binarytree.binarysearchtree;

import com.javapractice.datastructuresandalgorithms.datastructures.binarytree._constants.InitialiseNodes;
import com.javapractice.datastructuresandalgorithms.datastructures.binarytree._constants.Node;

import static com.javapractice.datastructuresandalgorithms.datastructures.binarytree.binarysearchtree.Methods.*;
import static com.javapractice.datastructuresandalgorithms.datastructures.binarytree.traversal.Methods.breadthFirst;
import static com.javapractice.datastructuresandalgorithms.datastructures.binarytree.traversal.Methods.inOrderRecursive;

public class Main {
    public static void main(String[] args) {
        Node<Integer> eight = new Node<>(8);

        insert(eight, 3);
        insert(eight, 10);
        insert(eight, 1);
        insert(eight, 14);
        insert(eight, 6);
        insert(eight, 4);
        insert(eight, 7);
        insert(eight, 13);

        System.out.println("\n");
        breadthFirst(eight);

        System.out.println("\nIn-order");
        inOrderRecursive(eight);

        System.out.println("\n");
        System.out.print(lookup(eight, 4));

        System.out.println("\n");
        System.out.print(lookup(eight, 15));

        System.out.println("\nMinimum value: " + minimumValue(eight));
        System.out.println("\nMaximum value: " + maximumValue(eight));

        System.out.println("\nPrint Range:");
        printRange(eight,7, 13);

        System.out.println("\n Is binary search tree?: " + isBinarySearchTree(eight));

        System.out.println("\n Is binary search tree?: " + isBinarySearchTree(InitialiseNodes.initialiseNumberNodes()));

    }
}
