package com.javapractice.datastructuresandalgorithms.datastructures.binarytree.mirroring;

import com.javapractice.datastructuresandalgorithms.datastructures.binarytree._constants.InitialiseNodes;
import com.javapractice.datastructuresandalgorithms.datastructures.binarytree._constants.Node;

import static com.javapractice.datastructuresandalgorithms.datastructures.binarytree.traversal.Methods.breadthFirst;

public class Main {
    public static void main(String[] args) {
        Node<Integer> nodes = InitialiseNodes.initialiseNumberNodes();

        System.out.println();
        System.out.println("original: ");
        breadthFirst(nodes);

        System.out.println("\n\nmirror: ");
        mirror(nodes);
        breadthFirst(nodes);
    }

    public static <T> void mirror(Node<T> root){
        if(root == null){
            return;
        }

        Node<T> Temporary = root.getLeftChild();

        root.setLeftChild(root.getRightChild());
        root.setRightChild(Temporary);

        mirror(root.getLeftChild());
        mirror(root.getRightChild());
    }
}
