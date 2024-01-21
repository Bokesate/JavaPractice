package com.javapractice.datastructureandalgorithms.binarytree.balancedbinarytree;

import com.javapractice.datastructureandalgorithms.binarytree._constants.InitialiseNodes;
import com.javapractice.datastructureandalgorithms.binarytree._constants.Node;

import java.util.HashMap;

import static com.javapractice.datastructureandalgorithms.binarytree.balancedbinarytree.Methods.isBalanced;

public class Main {
    public static void main(String[] args) {
        Node<?> balancedTree = InitialiseNodes.initialisePerfectBinaryTreeNodes();
        Node<?> nonBalancedTree = InitialiseNodes.initialiseNodes();

        System.out.println();
        System.out.println("balancedTree isBalanced: " + isBalanced(balancedTree, new HashMap<>()));

        System.out.println();
        System.out.println("nonBalancedTree isBalanced: " + isBalanced(nonBalancedTree, new HashMap<>()));
    }
}
