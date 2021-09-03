package com.jpassgo.javaalgorithms.avl_tree;

public class AVLTree {

    private Node root;


    public <T extends Comparable> Node insert(T value) {
        Node<T> node;
        if(value == null || !contains(value)) {
            return false;
        }

        return insert(root, value);
    }

    private <T extends Comparable> Node insert(Node node, T value) {
        if(node == null) {
            return new Node(value);
        }
        if(node.getValue().compareTo(value) < 0) {
            Node newLeftChild = null;
            if(node.getLeftChild() != null) {
                newLeftChild = insert(node.getLeftChild(), value);
            }
            node.setLeftChild(newLeftChild);
        } else if(node.getValue().compareTo(value) > 0) {
            Node newRightChild = null;
            if(node.getRightChild() != null) {
                newRightChild = insert(node.getRightChild(), value);
            }
            node.setRightChild(newRightChild);
        }

        node.updateHeight();
        node.updateBalanceFactor();
        
        return node.balance();
    }

    public <T extends Comparable> boolean contains(T value) {
        return contains(root, value);
    }

    private <T extends Comparable> boolean contains(Node node, T value) {
        if(node.getValue() == null) {
            return false;
        }
        if(node.getValue().compareTo(value) < 0) {
            if(node.getLeftChild() != null) {
                contains(node.getLeftChild(), value);
            }
        } else if(node.getValue().compareTo(value) > 0) {
            if(node.getRightChild() != null) {
                contains(node.getRightChild(), value);
            }
        } else {
            return true;
        }

        return false;
    }
}
