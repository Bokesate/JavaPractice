package com.javapractice.datastructureandalgorithms.binarytree.mirroring;

import com.javapractice.datastructureandalgorithms.binarytree._constants.InitialiseNodes;
import com.javapractice.datastructureandalgorithms.binarytree._constants.Node;
import static com.javapractice.datastructureandalgorithms.binarytree.traversal.Methods.breadthFirst;

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
