package com.javapractice.datastructures.binarytree.mirroring;

import com.javapractice.datastructures.binarytree.constants.InitialiseNodes;
import com.javapractice.datastructures.binarytree.constants.Node;
import static com.javapractice.datastructures.binarytree.traversal.Methods.breadthFirst;

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
