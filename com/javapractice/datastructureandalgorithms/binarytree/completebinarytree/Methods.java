package com.javapractice.datastructureandalgorithms.binarytree.completebinarytree;

import com.javapractice.datastructureandalgorithms.binarytree._constants.Node;

public class Methods {
    public static <T> boolean isComplete(Node<T> root, int currNodeIndex, int totalNodes){
        if(root == null){
            return true;
        }

        if(currNodeIndex >= totalNodes){
            return false;
        }

        int leftChildIndex = 2 * currNodeIndex + 1;
        int rightChildIndex = 2 * currNodeIndex + 2;

        return isComplete(root.getLeftChild(), leftChildIndex, totalNodes) &&
                isComplete(root.getRightChild(), rightChildIndex, totalNodes);
    }
}
