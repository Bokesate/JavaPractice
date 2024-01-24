package com.javapractice.datastructuresandalgorithms.datastructures.binarytree.fullbinarytree;

import com.javapractice.datastructuresandalgorithms.datastructures.binarytree._constants.Node;

public class Methods {
    public static <T> boolean isFull(Node<T> root) {
        if(root == null){
            return true;
        }

        if(root.getLeftChild() == null && root.getRightChild() == null){
            return true;
        }

        if(root.getLeftChild() != null && root.getRightChild() != null){
            return isFull(root.getLeftChild()) && isFull(root.getRightChild());
        }

        return false;
    }
}
