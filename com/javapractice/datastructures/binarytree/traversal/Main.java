package com.javapractice.datastructures.binarytree.traversal;

import com.javapractice.datastructures.binarytree.constants.InitialiseNodes;
import com.javapractice.datastructures.binarytree.constants.Node;

import static com.javapractice.datastructures.binarytree.traversal.Methods.*;

public class Main {
    public static void main(String[] args) {

        Node<?> nodes = InitialiseNodes.initialiseNodes();

        System.out.println("BreadthFirst Traversal");
        breadthFirst(nodes);
        System.out.println();
        System.out.println();

        System.out.println("DepthFirst InOrder Traversal");
        inOrderStack(nodes);
        System.out.println();
        System.out.println("DepthFirst InOrder Traversal Recursive");
        inOrderRecursive(nodes);
        System.out.println();
        System.out.println();

        System.out.println("DepthFirst PreOrder Traversal");
        preOrderStack(nodes);
        System.out.println();
        System.out.println("DepthFirst PreOrder Traversal Recursive");
        preOrderRecursive(nodes);
        System.out.println();
        System.out.println();

        System.out.println("DepthFirst PostOrder Traversal");
        postOrderStack(nodes);
        System.out.println();
        System.out.println("DepthFirst PostOrder Traversal Recursive");
        postOrderRecursive(nodes);
    }
}