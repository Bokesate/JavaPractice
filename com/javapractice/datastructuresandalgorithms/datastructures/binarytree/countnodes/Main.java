package com.javapractice.datastructuresandalgorithms.datastructures.binarytree.countnodes;

import com.javapractice.datastructuresandalgorithms.datastructures.binarytree._constants.Node;
import com.javapractice.datastructuresandalgorithms.datastructures.binarytree._constants.InitialiseNodes;

public class Main {
    public static void main(String[] args) {

        Node<?> nodes = InitialiseNodes.initialiseNodes();

        int count = countNodes(nodes);
        System.out.println(count);
    }

    //Recursive approach
    public static <T> int countNodes(Node<T> root){
        if(root == null){
            return 0;
        }

        int numNodesLeft = countNodes(root.getLeftChild());
        int numNodesRight = countNodes(root.getRightChild());

        return 1 + numNodesLeft + numNodesRight;
    }

}